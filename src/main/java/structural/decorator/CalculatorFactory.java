package structural.decorator;

public interface CalculatorFactory {
    Calculator getStandardCalculator();
    Calculator getPrintingCalculator();
    Calculator getPrintingAndSavingCalculator();
    Calculator getSavingCalculator();
    Calculator getSpammingCalculator(int timesSpamming);
}
