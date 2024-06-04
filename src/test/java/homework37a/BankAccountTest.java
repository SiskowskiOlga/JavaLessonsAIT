package homework37a;
import exceptions.InsufficientFundsException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp(){
        account =  new BankAccount(0, "1234567890");
    }


    @Test
    void testBalanceAddAmountPositive(){
        account.deposit(1000);
        assertEquals(1000, account.getBalance());
    }

    @Test
    void testBalanceAddAmountNegativThrowsException(){
        assertThrows(IllegalArgumentException.class,  ()->
                account.deposit(-1000));
    }

    @Test
    void testBalanceWithdrawNegativThrowsException(){
        assertThrows(IllegalArgumentException.class,  ()->
                account.withdraw(-1000));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/deposit.csv", numLinesToSkip = 1)
    void testBalanceAddAmountFromCSV(double amount, double expectedBalance) {
        account.deposit(amount);
        assertEquals(expectedBalance, account.getBalance());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/withdraw.csv", numLinesToSkip = 1)
    void testBalanceWithdrawFromCSV(double amount, double expectedBalance) throws InsufficientFundsException {
        account.deposit(1000);
        account.withdraw(amount);
        assertEquals(expectedBalance, account.getBalance());
    }

    //Проверка конструктора на исключение входящих чисел
    @ParameterizedTest
    @ValueSource(strings = {"123456789O", "l234567890", "123456789l"})
    void testBankAccountConstructorException(String input) {
        assertThrows(IllegalArgumentException.class, () -> {
            new BankAccount(0,input);
        });
    }

    //Проверка валидации банковского номера позитивные номера
    @ParameterizedTest
    @ValueSource(strings = {"1679584603", "8527419630", "6402793825"})
    void testisBankAccountValidPositive(String input) {
        assertTrue(account.isBankAccountValid(input));
    }



}
