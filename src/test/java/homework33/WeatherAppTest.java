package homework33;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WeatherAppTest {
    WeatherApp weatherApp;

    @BeforeEach
    void setUp() {
        weatherApp = new WeatherApp();
    }

    //Метод источник данных для теста CalculateAverageTemperatureListIsNullOrEmpty
    //Возвращает поток аргументов Stream<Arguments>, где каждый аргумент представляет собой некорректный список
    // температур (null или пустой список).
    static Stream<Arguments> invalidTemperatureProvider() {
        return Stream.of(
                Arguments.of((List<Double>) null),
                //List.of создает пустой список List
                Arguments.of(List.of())
        );
    }

    static Stream<Arguments> temperatureProvider(){
        return Stream.of(
                Arguments.of(Arrays.asList(15.0, 21.5, 33.8, 42.0,12.1), ((15.0+21.5+33.8+42.0+12.1)/5)),
                Arguments.of(Arrays.asList(0.0, 12.5, 9.5, 18.0,32.3), ((0.0+12.5+9.5+18.0+32.3)/5)),
                Arguments.of(Arrays.asList(12.0,12.0,12.0,12.0,12.0),12.0),
                Arguments.of(Arrays.asList(-20.0,0.0,20.0,0.0),0.0),
                Arguments.of(Arrays.asList(25.0,30.0,35.0),30.0)
        );
    }

    //тест проверяет, что метод calculateAverageTemperature выбрасывает IllegalArgumentException при передаче null
    // или пустого списка.
    @ParameterizedTest
    @MethodSource("invalidTemperatureProvider")
    void CalculateAverageTemperatureWithInvalidInput(List<Double> temperatures) {
        assertThrows(IllegalArgumentException.class, () -> {
            weatherApp.calculateAverageTemperature(temperatures);
        });
    }

    //тест проверяет, что метод возвращает правильную среднюю температуру
    @ParameterizedTest(name = "{index} ==> AVERAGE_TEMP: {1} - TEMPERATURES: {0}")
    @MethodSource("temperatureProvider")
    void calculateAverageTemperature(List<Double> temperatures,double expectedAverage) {
        double actualAverage = weatherApp.calculateAverageTemperature(temperatures);
        assertEquals(expectedAverage,actualAverage, 0.01);
    }



    @ParameterizedTest
    @CsvSource({
            "'10.0, 22.0, 0.0' , false",
            "'-1.0, 5.0, 18.0', true",
            "'5.0, 5.0, 18.0', false",
            "'5.0, 5.0, -18.0', true",
    })
    void testCheckForFrostWarnings(String temperatures, boolean expectedResult) {

        // Использован метод для преобразования String данных в Double (Для меня немного не понятен нашел в интернете)
        List<Double> temperaturesList = weatherApp.stringToDouble(temperatures);

        assertEquals(expectedResult, weatherApp.checkForFrostWarnings(temperaturesList));
    }


    @ParameterizedTest
    @EnumSource(CheckForFrostWarningValues.class)
    void CheckForFrostWarningListWithManyValues_ENUM(CheckForFrostWarningValues checkForFrostWarningValues){
        assertEquals(checkForFrostWarningValues.isExpected(), weatherApp.checkForFrostWarnings(checkForFrostWarningValues.getTempList()));
    }

    @ParameterizedTest
    @CsvSource({
            "null",
            "''"
    })
    void testCheckForFrostWarningsNullOrEmpty(String argument) {
        List<Double> temperaturesList = weatherApp.stringToDouble(argument);
        assertThrows(IllegalArgumentException.class, () -> {
            weatherApp.checkForFrostWarnings(temperaturesList);
        });
    }

    //тест проверяет, выбрасывается ли исключение IllegalArgumentException, если передан null.
    @Test
    void checkForFrostWarningsWithNull(){
        assertThrows(IllegalArgumentException.class, () -> {
            weatherApp.checkForFrostWarnings(null);
        });
    }

    @ParameterizedTest
    @CsvSource({
            "'10.0, 15.0, 18.0', 'Низкий'",
            "'20.0, 25.0, 30.0', 'Средний'",
            "'50.0, 60.0, 70.0', 'Высокий'",
            "'15.0, 20.0, 55.0', 'Средний'",
            "'5.0, 10.0, 15.0', 'Низкий'",
            "'60.0, 70.0, 80.0', 'Высокий'"
    })
    void testEvaluatePrecipitationLevels(String precipitationLevels, String expectedResult) {

        List<Double> precipitationList = weatherApp.stringToDouble(precipitationLevels);

        assertEquals(expectedResult, weatherApp.evaluatePrecipitationLevels(precipitationList));

    }

    @ParameterizedTest
    @CsvSource({
            "null",
            "''"
    })
    void testEvaluatePrecipitationLevelsNullOrEmpty(String argument) {
        List<Double> precipitationList = weatherApp.stringToDouble(argument);

        assertThrows(IllegalArgumentException.class, () -> {
            weatherApp.evaluatePrecipitationLevels(precipitationList);
        });

    }

}
