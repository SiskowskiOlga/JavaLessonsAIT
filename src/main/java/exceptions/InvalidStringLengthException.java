package exceptions;

public class InvalidStringLengthException extends Exception {
    //создали конструктор с сообщением в нутри, это проверяемый эксептион
    public InvalidStringLengthException(String message) {

        super(message);
    }

}
