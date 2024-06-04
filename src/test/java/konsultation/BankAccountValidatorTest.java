package konsultation;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankAccountValidatorTest {
    @ParameterizedTest
    @ValueSource (strings = {"1234567", "12345678901", "12345A6789"})
    public void isValid(String input) {
        BankAccountValidator bankAccountValidator = new BankAccountValidator();
        assertFalse(bankAccountValidator.isBankAccountValid(input));
        assertTrue(bankAccountValidator.isBankAccountValid("1234567890"));
    }

}
