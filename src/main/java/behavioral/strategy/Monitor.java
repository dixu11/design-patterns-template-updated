package behavioral.strategy;

import java.util.Random;

public class Monitor {

    private int secondsWithoutInput = 0;
    private final int secondsToScreenSaver; //po ilu sekundach uruchomić wygaszacz
    private final int secondsToShutdown; //po ilu sekundach wyłączyć ekran

    private RenderStrategy renderStrategy;


    public Monitor(int secondsToScreenSaver, int secondsToShutdown) {
        this.secondsToScreenSaver = secondsToScreenSaver;
        this.secondsToShutdown = secondsToShutdown;
        renderStrategy = new RenderScreenStrategy();
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

    private void updateRenderStrategy() {
        if (secondsWithoutInput == secondsToScreenSaver) {
            renderStrategy = new RenderScreenSaverStrategy();
        } else if (secondsWithoutInput == secondsToShutdown) {
            renderStrategy = new RenderNothingStrategy();
        } else if (secondsWithoutInput < secondsToScreenSaver) {
            renderStrategy = new RenderScreenStrategy();
        }
    }

    private boolean hasUserInteracted() {
        return Math.random() <= 0.02;  //2% szansa na to że w tej sekundzie testowania user wykonał interakcje
    }

    private void renderScreen() {
       renderStrategy.render();
    //dla tej metody zastosuj wzorzec strategii
    }


}
