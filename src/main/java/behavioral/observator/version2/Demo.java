package behavioral.observator.version2;

public class Demo {
    public static void main(String[] args) {
        //stacja generuje pomiary: temperatura, ciśnienie
        //inna klasa komunikuje aktualną pogodę zaraz po pomiarze

        WeatherStation weatherStation = new WeatherStation();
        System.out.println(weatherStation);

    }
}
