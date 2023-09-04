package Task_01.Exception;

public class MissingCapitalLetterInPasswordException extends Exception{
    public MissingCapitalLetterInPasswordException(String message) {
        super(message);
    }
}
