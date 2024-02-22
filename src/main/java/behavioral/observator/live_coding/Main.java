package behavioral.observator.live_coding;

class Main {
    public static void main(String[] args) throws InterruptedException {
        WeatherStation weatherStation = new WeatherStation(Mode.RANDOM);
        weatherStation.makeInfiniteMeasurements();
        /*
        * WeatherStation
        *  - w losowych odstępach czasu robić pomiary pogodowe
        * WeatherAnnouncer
        *  - gdy stacja wykona pomiar wyświetli parametry pogodowe w konsoli
        * */
    }
}
