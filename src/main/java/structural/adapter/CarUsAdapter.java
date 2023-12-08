package structural.adapter;

import structural.adapter.american_module.CarUS;
import structural.adapter.eu_cars.CarEU;

public class CarUsAdapter implements CarEU {

    private CarUS carUs;

    public CarUsAdapter(CarUS carUs) {
        this.carUs = carUs;
    }

    @Override
    public double getMileageInKm() {
        return carUs.getMileageInMiles() * 1.6;
    }

    @Override
    public String getName() {
        return carUs.getName();
    }
}
