package task01;

import tools.InputNumber;

public class Program {
    InputNumber tools;
    public Program() {
        this.tools = new InputNumber();
    }
    public void run(){
        int number = tools.getInteger("Введите число! ");
        if (number < 1){
            try {
                throw new InvalidNumberException("Некорректное число");
            } catch (InvalidNumberException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Число корректно");
        }
    }
    public void run(int a){
        if (a < 1){
            try {
                throw new InvalidNumberException("Некорректное число");
            } catch (InvalidNumberException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Число корректно");
        }
    }


}
