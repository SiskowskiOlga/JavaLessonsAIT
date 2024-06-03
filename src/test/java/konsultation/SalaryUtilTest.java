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

        @org.junit.jupiter.api.BeforeEach
        public void setUp(){
            salaryUtil = new SalaryUtil();
        }

        @org.junit.jupiter.api.Test
        void testBruttoSalaryLess_2000(){
            assertEquals(1500, salaryUtil.getNettoSalary(1500));
        }

        @org.junit.jupiter.api.Test
        void testBruttoSalaryMore_5000(){
            assertEquals(8500, salaryUtil.getNettoSalary(10000));
        }

        @org.junit.jupiter.params.ParameterizedTest(name = "{index} ==> BRUTTO SALARY: {0} - NETTO SALARY {1} ")
        @org.junit.jupiter.params.provider.CsvFileSource(resources = "/salary.csv", numLinesToSkip = 1)
        void testBruttoSalaryCsvFile(double bruttoSalary, double expectedNettoSalary){
            assertEquals(expectedNettoSalary, salaryUtil.getNettoSalary(bruttoSalary));
        }

        @org.junit.jupiter.params.ParameterizedTest(name = "{index} ==> BRUTTO SALARY: {0} - NETTO SALARY {1} ")
        @org.junit.jupiter.params.provider.CsvSource({
                "1000,   1000",
                "2500,   2375",
                "4200,   3780",
                "7000,   5950",
        })
        void testBruttoSalaryCsvSource(double bruttoSalary, double expectedNettoSalary){
            assertEquals(expectedNettoSalary, salaryUtil.getNettoSalary(bruttoSalary));

        }

        @org.junit.jupiter.params.ParameterizedTest
        @org.junit.jupiter.params.provider.EnumSource(TestBruttoNettoSalary.class)
        void testBruttoSalaryEnumTest(TestBruttoNettoSalary testEnum){
            assertEquals(testEnum.getExpectedNetto(), salaryUtil.getNettoSalary(testEnum.getBrutto()));
        }

        @org.junit.jupiter.params.ParameterizedTest
        @org.junit.jupiter.params.provider.ValueSource(doubles = {1000, 2500,4200, 7000})
        void testBruttoSalaryValueSource(double bruttoSalary){
            java.util.Map<Double, Double> expectedSalary = new java.util.HashMap<>();
            expectedSalary.put(1000.0,1000.0);
            expectedSalary.put(2500.0,2375.0);
            expectedSalary.put(4200.0,3780.0);
            expectedSalary.put(7000.0,5950.0);
            assertEquals(expectedSalary.get(bruttoSalary), salaryUtil.getNettoSalary(bruttoSalary));



        }

    }


