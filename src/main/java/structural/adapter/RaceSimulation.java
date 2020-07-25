package structural.adapter;

import structural.adapter.eu_cars.CarEU;

import java.util.ArrayList;
import java.util.List;

public class RaceSimulation {

    private List<CarEU> cars;

    public RaceSimulation() {
        cars = new ArrayList<>();
    }

    public void addCar(CarEU car) {
        cars.add(car);
    }

    public void simulateRace(int distance) {
        System.out.println("After race mileage is:");
        for (CarEU car : cars) {
            System.out.printf("%s: %.2fkm\n",
                    car.getName(),
                    car.getMileageInKm() + distance);
        }
        System.out.println("Other statistics are...");
    }
}
