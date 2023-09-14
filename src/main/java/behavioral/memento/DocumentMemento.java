package behavioral.memento;

import java.awt.*;

public class DocumentMemento {
    private final String text;
    private final int fontSize;
    private final Color color;

    public DocumentMemento(String text, int fontSize, Color color) {
        this.text = text;
        this.fontSize = fontSize;
        this.color = color;
    }

    public String getText() {
        return text;
    }

    public int getFontSize() {
        return fontSize;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "DocumentMemento{" +
                "text='" + text + '\'' +
                ", fontSize=" + fontSize +
                ", color=" + color +
                '}';
    }
}
