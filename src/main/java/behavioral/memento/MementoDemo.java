package behavioral.memento;

import java.awt.*;

public class MementoDemo {
    public static void main(String[] args) {
        Document document = new Document();
        System.out.println(document);
        document.append("Ala ");
        document.append("ma kota");
        DocumentMemento memento = document.createMemento();
        document.setFontSize(20);
        document.setColor(Color.BLUE);
        System.out.println(document);
        System.out.println(memento);

    }
}
