package structural.adapter.american_module;

public class Tesla implements CarUS{
    private double mileage;

    public Tesla(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public double getMileageInMiles() {
        return mileage;
    }

    @Override
    public String getName() {
        return "Tesla";
    }
}
