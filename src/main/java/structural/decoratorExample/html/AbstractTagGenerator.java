package structural.decoratorExample.html;

public abstract class AbstractTagGenerator implements TagGenerator{

    private StringBuilder html = new StringBuilder();
    private int center;

    @Override
    public void putInside(String tag) {
        html.insert(center, tag);
    }

    @Override
    public String getContent() {
        return html.toString();
    }

    @Override
    public int getCenter() {
        return center;
    }

    @Override
    public void moveCenter(int offset) {
        this.center = offset;
    }
}
