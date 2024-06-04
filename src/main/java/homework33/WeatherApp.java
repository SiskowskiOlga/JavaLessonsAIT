package homework33;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WeatherApp {
    /*
    Разработка модульных тестов для системы мониторинга погодных данных

Цель
Разработать параметризированные тесты для методов, которые обрабатывают данные мониторинга погоды, включая температуру, давление и уровень осадков.

Задачи
Тестирование метода расчёта средней температуры:

Метод: calculateAverageTemperature(List<Double> temperatures)
Описание: Метод принимает список значений температур и возвращает их среднее значение.
Тесты: Используйте @ParameterizedTest с @MethodSource для подачи списков температур и ожидаемых средних значений.
Тестирование метода проверки предупреждений о заморозках:

Метод: checkForFrostWarnings(List<Double> temperatures)
Описание: Метод принимает список температур и возвращает true, если хотя бы одна из температур ниже 0°C.
Тесты: Используйте @ParameterizedTest с @ValueSource или @CsvSource для предоставления различных температурных данных и ожидаемых результатов.
Тестирование метода оценки уровня осадков:

Метод: evaluatePrecipitationLevels(List<Double> precipitationLevels)
Описание: Метод принимает список значений осадков и классифицирует их как 'Низкий', 'Средний', 'Высокий'.
Тесты: Создайте параметризированные тесты, используя @CsvSource для подачи списков уровней осадков и ожидаемых классификаций.
Требования к тестам
Все тесты должны проверять не только правильность вычислений, но и корректность обработки исключительных ситуаций (например, пустой список входных данных).
Используйте ассерты для проверки ожидаемых результатов.
Обеспечьте достаточное покрытие разнообразных сценариев для каждого теста.
     */
    //Метод принимает список значений температур и возвращает их среднее значение.
    public double calculateAverageTemperature(List<Double> temperatureList) {
        if (temperatureList == null || temperatureList.isEmpty()) {
            throw new IllegalArgumentException("The temperature list cannot be null or empty");
        }

        double sum = 0;
        for (double temperature : temperatureList) {
            sum += temperature;
        }
        return sum / temperatureList.size();
    }

    // Метод принимает список температур и возвращает true, если хотя бы одна из температур ниже 0°C.
    public boolean checkForFrostWarnings(List<Double> temperatures) {
        if (temperatures == null || temperatures.isEmpty()) {
            throw new IllegalArgumentException("Temperature list must not be null or empty");
        } else {
            for (Double temp : temperatures) {
                if (temp < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public List<Double> stringToDouble(String argument) {
        String nullArgument = "";
        if (argument.equalsIgnoreCase("null")) {
            nullArgument = argument = null;
        }
        if (nullArgument == null || argument.isEmpty()) {
            return List.of();
        }
        String[] tempArray = argument.split(",\\s*");
        return Arrays.stream(tempArray)
                .map(Double::parseDouble)
                .collect(Collectors.toList());
    }

    public String evaluatePrecipitationLevels(List<Double> precipitationLevels) {
        if (precipitationLevels == null || precipitationLevels.isEmpty()) {
            throw new IllegalArgumentException("Precipitation levels list must not be null or empty");
        }

        double result = 0;
        for (Double lvl : precipitationLevels) {
            result += lvl;
        }
        double average = result / precipitationLevels.size();

        if (average < 20) {
            return "Низкий";

        } else if (average <= 50) {
            return "Средний";

        }

        return "Высокий";
    }


}
