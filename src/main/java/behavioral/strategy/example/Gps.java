package behavioral.strategy.example;


import java.util.Random;


public class Gps {

    private RoadStrategy roadStrategy;

    public int calculateRead() {
        return roadStrategy.calculateRoad();
    }

    public void setRoadStrategy(RoadStrategy roadStrategy) {
        this.roadStrategy = roadStrategy;
    }
}

interface RoadStrategy {
    int calculateRoad();
}

class WalkRoadStrategy implements RoadStrategy{

    @Override
    public int calculateRoad() {
        Random random = new Random();
        return random.nextInt(10)+5;
    }
}

class BikeRoadStrategy implements RoadStrategy{

    @Override
    public int calculateRoad() {
        Random random = new Random();
        return random.nextInt(5)+1;
    }
}

class GpsDemo{
    public static void main(String[] args) {
        Gps gps = new Gps();
        gps.setRoadStrategy(new WalkRoadStrategy());
        System.out.println("Wyliczam trasę");
        int distance = gps.calculateRead();
        System.out.println("Trasa: " + distance + "km");

        gps.setRoadStrategy(new BikeRoadStrategy());
        System.out.println("Wyliczam trasę");
         distance = gps.calculateRead();
        System.out.println("Trasa: " + distance + "km");
    }
}
