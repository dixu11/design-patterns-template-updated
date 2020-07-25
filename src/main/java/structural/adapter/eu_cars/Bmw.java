package structural.adapter.eu_cars;

public class Bmw implements CarEU {

    private double mileage;

    public Bmw(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public double getMileageInKm() {
        return mileage;
    }

    @Override
    public String getName() {
        return "BMW";
    }
}
