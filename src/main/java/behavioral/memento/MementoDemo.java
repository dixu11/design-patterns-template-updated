package behavioral.memento;

import java.awt.*;

public class MementoDemo {
    public static void main(String[] args) {
        Document document = new Document();
       // System.out.println(document);
        Caretaker caretaker = new Caretaker(document);
        // nie manipulujemy bezpośrednio stanem pamiątek - chowamy je za pomocniczą klasą
        caretaker.save();
        document.append("Ala ");
        caretaker.save();
        document.append("ma kota");
        caretaker.save();
        //DocumentMemento memento = document.createMemento();
        document.setFontSize(20);
        caretaker.save();
        document.setColor(Color.BLUE);
        System.out.println(document);
        caretaker.undo();
        System.out.println(document);
        caretaker.undo();
        System.out.println(document);
        caretaker.undo();
        System.out.println(document);
        caretaker.undo();
        System.out.println(document);
        caretaker.undo();
        System.out.println(document);


    }
}
