package behavioral.memento;

import java.awt.*;

public class Document {
    private String text = "";
    private int fontSize = 12;
    private Color color = Color.BLACK;

    public void append(String newText) {
        text += newText;
    }


    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    DocumentMemento createMemento() {
        return new DocumentMemento(text, fontSize, color);
    }

    void revert(DocumentMemento memento) {
        text = memento.getText();
        fontSize = memento.getFontSize();
        color = memento.getColor();
    }

    @Override
    public String toString() {
        return "Document{" +
                "text='" + text + '\'' +
                ", fontSize=" + fontSize +
                ", color=" + color +
                '}';
    }
}
