package behavioral.chainOfResponsibility.noPattern;

public class LoggerDemo {

    public static void main(String[] args) throws InterruptedException {
        Logger logger = new Logger();
        System.out.println("Test dla ustawienia: " + LogLvl.DEBUG); // powinny wyświetlić się wszystkie logi

        logger.log("Ilość czujników dymu: 5", LogLvl.DEBUG);
        logger.log("System antypożarowy uruchomiony", LogLvl.INFO);
        logger.log("Chyba ktoś podłożył ogień...", LogLvl.WARNING);
        logger.log("Wszystko wybuchło!", LogLvl.ERROR);

        Thread.sleep(1000); // czekam sekundę
        System.out.println("----");
        System.out.println("Test dla ustawienia: " + LogLvl.WARNING); // logi z niższym priorytetem niż WARNING nie powinny się wyświetlić
        logger.setMinLogLvl(LogLvl.WARNING);

        logger.log("Debug który nie powinien się wyświetlić", LogLvl.DEBUG);
        logger.log("Info, które nie powinno się wyświetlić", LogLvl.INFO);
        logger.log("Wykryto włamanie", LogLvl.WARNING);
        logger.log("Odcięto przewód do systemu antywłamaniowego", LogLvl.ERROR);

    }



}
