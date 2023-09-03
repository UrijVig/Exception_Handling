package tools;

import java.util.Scanner;

public class InputNumber {


    private Scanner scanner;

    public int getInteger(String massage) {
        int number;
        while (true){
            System.out.println(massage);
            try {
                number = Integer.parseInt(scanner.nextLine());
                return number;
            } catch (Exception e) {
                System.out.println("Ошибка ввода! " + e.getMessage());
            }
        }
    }

    public void start() {
        this.scanner = new Scanner(System.in);
    }

    public void close(){
        this.scanner.close();
    }
}
