package task02;

import tools.InputNumber;
public class Program {
    InputNumber tools;

    public Program() {
        this.tools = new InputNumber();
    }

    public void run() {
        tools.start();
        int number1 = tools.getInteger("Введите первое число!");
        int number2 = tools.getInteger("Введите второе число!");
        tools.close();
        if (number2 == 0) {
            try {
                throw new DivisionByZeroException("Деление на ноль недопустимо");
            } catch (DivisionByZeroException e) {
                throw new RuntimeException(e);
            }
        } else {
            double result = (double) number1 / (double) number2;
            System.out.printf("%d / %d = %.2f", number1, number2, result);
        }
    }
    public void run(int a, int b){
        if (b == 0) {
            try {
                throw new DivisionByZeroException("Деление на ноль недопустимо");
            } catch (DivisionByZeroException e) {
                throw new RuntimeException(e);
            }
        } else {
            double result = (double) a / (double) b;
            System.out.printf("%d / %d = %.2f", a, b, result);
        }
    }
}
