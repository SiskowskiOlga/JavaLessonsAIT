package konsultation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class SalaryUtilTest {
    private SalaryUtil salaryUtil;

    @BeforeEach
    public void setUp() {
        salaryUtil = new SalaryUtil();//инициализируем конкретный объект, подготавливаем, чтобы через него вызывать getNettoSalary
    }

    @Test
    void testBruttoSelaryLess_2000() { //проверяем что зарплата меньше 2000 и возврат идет без снятия налога
        assertEquals(1500, salaryUtil.getNettoSalary(1500));
    }

    //проверяем что зарплата большее 5000 и налог 15% удерживают
    @Test
    void testBruttoSelaryMore_5000() {
        assertEquals(8500, salaryUtil.getNettoSalary(10000));
    }
    //прописываем шапку, шаблон для выдачи результата
    @ParameterizedTest(name = "{index} ==> BRUTTO SALARY: {0} - NETTO SALARY {1} ")
    //прописываем источник данных файл будем брать от туда данные
    @CsvFileSource(resources = "/salary.csv", numLinesToSkip = 1)//1 =>это брать со второй строчки из файла
    void testBruttoSalaryCsvFile(double bruttoSalary, double expectedNettoSalary) {
        assertEquals(expectedNettoSalary, salaryUtil.getNettoSalary(bruttoSalary));
    }
    @ParameterizedTest(name = "{index} ==> BRUTTO SALARY: {0} - NETTO SALARY {1} ")
    @CsvSource({//как вариант мы сразу прописываем документ, а не отдельно в файле, как выше, если их немного
            "1000,   1000",
            "2500,   2375",
            "4200,   3780",
            "7000,   5950",
    })
    void testBruttoSalaryCsvSource(double bruttoSalary, double expectedNettoSalary) {
        assertEquals(expectedNettoSalary, salaryUtil.getNettoSalary(bruttoSalary));

    }

    @ParameterizedTest
    @EnumSource(TestBruttoNettoSalary.class)
    void testBruttoSalaryEnumTest(TestBruttoNettoSalary testEnum) {
        assertEquals(testEnum.getExpectedNetto(), salaryUtil.getNettoSalary(testEnum.getBrutto()));
    }

    @ParameterizedTest
    @ValueSource(doubles = {1000, 2500, 4200, 7000})
    void testBruttoSalaryValueSource(double bruttoSalary) {
        Map<Double, Double> expectedSalary = new HashMap<>();
        expectedSalary.put(1000.0, 1000.0);
        expectedSalary.put(2500.0, 2375.0);
        expectedSalary.put(4200.0, 3780.0);
        expectedSalary.put(7000.0, 5950.0);
        assertEquals(expectedSalary.get(bruttoSalary), salaryUtil.getNettoSalary(bruttoSalary));


    }
}

