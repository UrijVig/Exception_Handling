package Task_01;

import Task_01.Exception.MissingCapitalLetterInPasswordException;
import Task_01.Exception.MissingNumberInPasswordException;
import Task_01.Exception.PasswordLengthException;
import Task_01.tools.InputData;
import Task_01.tools.PasswordVerifier;

import java.util.Scanner;

public class Program {
    private final Scanner scanner;
    public Program() {
        this.scanner = new Scanner(System.in);
    }

    public void run(){
        InputData dataIn = new InputData();
        PasswordVerifier verifier = new PasswordVerifier();
        boolean length, number, capitalLetter, flag = false;
        String password;
        while (!flag){
            length =  false;
            number = false;
            capitalLetter = false;
            password = dataIn.getData("Введите пароль! ", scanner);
            try {
                length = verifier.checkLength(password);
            } catch (PasswordLengthException e) {
                System.out.println(e.getMessage());
            }
            try {
                number = verifier.checkForNumber(password);
            } catch (MissingNumberInPasswordException e) {
                System.out.println(e.getMessage());
            }
            try {
                capitalLetter = verifier.checkForCapitalization(password);
            } catch (MissingCapitalLetterInPasswordException e) {
                System.out.println(e.getMessage());
            }
            flag = length && number && capitalLetter;
        }
        System.out.println("Ваш пароль соответствует требованиям безопасности!");
    }
}
