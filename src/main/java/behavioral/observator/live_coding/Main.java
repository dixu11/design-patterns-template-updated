package behavioral.observator.live_coding;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//przygotowuje obiekty
//konfiguruje obiekty
//uruchamia aplikacje (pomiary)
class Main {
    public static void main(String[] args) throws InterruptedException {
        WeatherAnnouncer weatherAnnouncer = new WeatherAnnouncer();
        WeatherForecaster weatherForecaster = new WeatherForecaster();
        FireAlarm fireAlarm = new FireAlarm();

        WeatherStation weatherStation = new WeatherStation(Mode.RANDOM);
        weatherStation.add(weatherAnnouncer);
        weatherStation.add(weatherForecaster);
        weatherStation.add(fireAlarm);

        weatherStation.makeInfiniteMeasurements();

        /*
         * - nowe pomiary (WeatherStation, WeatherData )
         * - inne klasy wykorzystujące pomiary (Main + nowa klasa)
         * */


        /*
         * WeatherStation

         * odowe
         * WeatherAnnouncer
         *  - gdy stacja wykona pomiar wyświetli parametry pogodowe w konsoli
         * */
    }
}
