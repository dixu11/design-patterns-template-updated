package structural.decorator;

public class StandardCalculator implements Calculator{

    @Override
    public int add(int number1, int number2) {
        return number1 + number2;
    }
}
