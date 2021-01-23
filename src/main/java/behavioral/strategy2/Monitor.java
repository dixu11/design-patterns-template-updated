package behavioral.strategy2;

public class Monitor {

    private int secondsWithoutInput = 0;
    private final int secondsToScreenSaver; //po ilu sekundach uruchomić wygaszacz
    private final int secondsToShutdown; //po ilu sekundach wyłączyć ekran

    public Monitor(int secondsToScreenSaver, int secondsToShutdown) {
        this.secondsToScreenSaver = secondsToScreenSaver;
        this.secondsToShutdown = secondsToShutdown;
    }

    public void testMonitorFor(int seconds){
        for (int i = 0; i < seconds; i++) {
            secondsWithoutInput++;
            renderScreen();
            if (hasUserInteracted()) {
                secondsWithoutInput = 0; //resetujemy licznik wygaszacza jeśli była interakcja
                System.out.println("<INTERACTION DETECTED>");
            }
            updateRenderStrategy();
        }
    }

    private void renderScreen() {
        //TODO metodę należy dokończyć
    }

    private boolean hasUserInteracted() {
        return Math.random() <= 0.02;  //2% szansa na to że w tej sekundzie testowania user wykonał interakcje
    }

    private void updateRenderStrategy() {
      //TODO metodę należy dokończyć
    }






}
