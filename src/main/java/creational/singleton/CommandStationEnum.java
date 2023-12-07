package creational.singleton;

public enum CommandStationEnum {
    INSTANCE;

    CommandStationEnum() {
        System.out.println("Enum");
    }
}
