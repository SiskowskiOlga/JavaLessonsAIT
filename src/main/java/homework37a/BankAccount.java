package homework37a;
import exceptions.InsufficientFundsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {
    private static final Logger LOGGER = LoggerFactory.getLogger(BankAccount.class);


    private double balance;
    private String accountNumber;

    public BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        if(isBankAccountValid(accountNumber)){
            this.accountNumber = accountNumber;
        }

    }

    public double getBalance() {
        return balance;
    }


    public String getAccountNumber() {
        return accountNumber;
    }


    public void deposit(double amount){
        if(amount <= 0){
            LOGGER.error("Amount can't be negative or 0. Amount: {}", amount);
            throw new IllegalArgumentException("Amount can't be negative or 0. Amount: " + amount);
        }
        balance = balance + amount;
        LOGGER.info("Deposit successful. Amount: {}, Balance {}", amount, balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount <= 0){
            LOGGER.error("Amount can't be negative or 0. Amount: {}", amount);
            throw new IllegalArgumentException("Amount can't be negative or 0. Amount: " + amount);
        }
        if(amount > balance){
            double shortage = amount - balance;
            LOGGER.error("Insufficient funds. Shortage: {}", shortage);
            throw new InsufficientFundsException(shortage);
        }
        balance = balance - amount;
        LOGGER.info("Withdraw successful. Amount: {}, Balance {}", amount, balance);
    }

    public static boolean isBankAccountValid(String accountNumber) {
        LOGGER.info("Validiere Bank account {}", accountNumber);
        accountNumber = accountNumber.trim();
        if(accountNumber.length() != 10){
            LOGGER.error("Length ist wrong: {} ", accountNumber);
            throw new IllegalArgumentException("Length ist wrong: " + accountNumber);
        }
        for(int i = 0; i < accountNumber.length(); i++){
            if(!Character.isDigit(accountNumber.charAt(i))){
                LOGGER.error("Character {} ist wrong: {} ", accountNumber.charAt(i), accountNumber);
                throw new IllegalArgumentException("Character ist wrong: " + accountNumber);
            }
        }
        LOGGER.info("Bank account {} is valid", accountNumber);
        return true;
    }

}
