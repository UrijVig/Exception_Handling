package Task_01.tools;

import java.util.Scanner;

public class InputData {

    public String getData(String massage, Scanner scanner) {
        String input;
        System.out.println(massage);
        input = scanner.nextLine();
        return input;
    }
}
