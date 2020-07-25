package behavioral.template_method;

import javax.swing.*;

public class Demo {

    /*Zastosuj wzorzec Metoda Szablonowa aby rozszerzyć działanie programu.
     * Wyciągnij bierzące działanie do nowej klasy TextConverterConsole oraz dodaj nowe:
     * TextConverterGui. Nowe działanie ma polegać na tym, że zamiast posługiwać się konsolą
     * wykorzystasz gotowe proste okna z klasy JOptionPane. Ich działanie demonstrują poniższe
     * statyczne metody
     * */

    public static void main(String[] args) {
        showGuiInputAndOutputExample();
    }

    private static void showGuiInputAndOutputExample() {
        String name = JOptionPane.showInputDialog("Jak masz na imie?");
        JOptionPane.showMessageDialog(null, "Miłego dnia " + name + "!");
    }

}
