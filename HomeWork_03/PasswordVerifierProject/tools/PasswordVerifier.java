package PasswordVerifierProject.tools;

import PasswordVerifierProject.Exception.MissingCapitalLetterInPasswordException;
import PasswordVerifierProject.Exception.MissingNumberInPasswordException;
import PasswordVerifierProject.Exception.PasswordLengthException;

public class PasswordVerifier {
    public boolean checkLength(String data) throws PasswordLengthException {
        if(data.length() < 8 ){
            throw new PasswordLengthException("Пароль ылишком короткий!");
        } else {
            return true;
        }
    }

    public boolean checkForNumber(String data) throws MissingNumberInPasswordException {
        char[] inData = data.toCharArray();
        for (char el: inData) {
            if (Character.isDigit(el)){
                return true;
            }
        }
        throw new MissingNumberInPasswordException("В введённом пароле отсутствует число!");
    }

    public boolean checkForCapitalization(String data) throws MissingCapitalLetterInPasswordException {
        if(data.equals(data.toLowerCase())){
            throw new MissingCapitalLetterInPasswordException("В введённом пароле отсутствует заглавная буква!");
        }
        return true;
    }
}
