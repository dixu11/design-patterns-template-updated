package behavioral.memento;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Caretaker {
    //w javie implementujemy stos wykorzystując interface Deque
    private Deque<DocumentMemento> mementos = new LinkedList<>();
    private Document document;

    public Caretaker(Document document) {
        this.document = document;
    }

    public void save() {
        mementos.push(document.createMemento());
    }

    public void undo() {
        if (mementos.isEmpty()) return;
        DocumentMemento memento = mementos.pop();
        document.revert(memento);
    }
}
