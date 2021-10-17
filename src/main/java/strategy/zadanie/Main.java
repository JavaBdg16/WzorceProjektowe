package strategy.zadanie;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(new AddStrategy());
        System.out.println(calculator.calculate(1, 2));

        calculator.setStrategy(new SubstractStrategy());
        System.out.println(calculator.calculate(1, 2));
    }
}
