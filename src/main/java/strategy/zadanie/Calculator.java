package strategy.zadanie;

public class Calculator {

    private CalculationStrategy strategy;

    public Calculator(CalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public int calculate(int a, int b) {
        return strategy.calculate(a, b);
    }

    public void setStrategy(CalculationStrategy strategy) {
        this.strategy = strategy;
    }
}
