package PasswordVerifierProject.Exception;

public class MissingCapitalLetterInPasswordException extends Exception{
    public MissingCapitalLetterInPasswordException(String message) {
        super(message);
    }
}
