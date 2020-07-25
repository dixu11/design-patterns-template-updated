package behavioral.observator;

public enum Weather {
    RAINING, SNOWING, CLOUDY, SUNNY, WINDY;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
