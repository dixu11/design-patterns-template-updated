package structural.adapter;

import structural.adapter.american_module.CarUS;
import structural.adapter.american_module.Tesla;
import structural.adapter.eu_cars.Bmw;
import structural.adapter.eu_cars.CarEU;

public class Demo {
    public static void main(String[] args) {
        /*
        Pracujesz nad aplikacją symulującą wyścigi samochodowe. Z amerykańskiego oddziału firmy
        otrzymałeś zewnętrzną bibliotekę american_module której nie możesz modyfikować. Twoim zadaniem
        jest wykorzystanie dostarczonego samochodu Tesla w już gotowym module wyścigowym. Nie możesz modyfikować
        żadnej z istniejących klas w w metodzie main możesz uzupełnić wyłącznie kod w miejscu opisanym "your code"
        uzupełnik nie kompilujący się fragment w podanym miejscu aby otrzymać oczekiwny
        * wynik w konsoli. Zastosuj wzorzec adapter oraz przelicznik 1 mila = 1,6 km */
        CarUS tesla = new Tesla(1000);
        CarEU teslaEu = new CarUsAdapter(tesla) ;
        CarEU bmw = new Bmw(5000);

        RaceSimulation raceSimulation = new RaceSimulation();
        raceSimulation.addCar(teslaEu);
        raceSimulation.addCar(bmw);

        raceSimulation.simulateRace(50);
    }

    /*Oczekiwany wydruk w konsoli:
    * After race mileage is:
    * Tesla: 1650,00km
    * BMW: 5050,00km
    * Other statistics are...
    * */
}
