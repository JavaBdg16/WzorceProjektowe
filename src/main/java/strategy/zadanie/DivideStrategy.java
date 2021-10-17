package strategy.zadanie;

public class DivideStrategy implements CalculationStrategy {
    @Override
    public int calculate(int a, int b) {
        return a / b;
    }
}
