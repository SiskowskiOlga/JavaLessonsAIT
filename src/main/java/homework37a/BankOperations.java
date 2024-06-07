package homework37a;
import exceptions.InsufficientFundsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankOperations {
    private static final Logger LOGGER = LoggerFactory.getLogger(BankOperations.class);


    public static void main(String[] args) {
        try {
            BankAccount bankAccount = new BankAccount(0, "123456789O");
            bankAccount.deposit(250);
            bankAccount.deposit(300);
            bankAccount.deposit(20);

            bankAccount.withdraw(500);
            bankAccount.withdraw(-100);
        } catch (InsufficientFundsException | IllegalArgumentException exception) {
            LOGGER.error(exception.getMessage());
        }

        finally {
            LOGGER.info("Operation was ended");
        }


    }

}
