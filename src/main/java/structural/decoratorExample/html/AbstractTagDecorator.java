package structural.decoratorExample.html;

public abstract class AbstractTagDecorator implements TagGenerator {

    private AbstractTagGenerator tagGenerator;

    public AbstractTagDecorator(AbstractTagGenerator tagGenerator) {
        this.tagGenerator = tagGenerator;
    }

    @Override
    public void addTags() {
        tagGenerator.addTags();
    }

    @Override
    public void putInside(String tag) {
        tagGenerator.putInside(tag);
    }

    @Override
    public String getContent() {
        return tagGenerator.getContent();
    }

    @Override
    public int getCenter() {
        return tagGenerator.getCenter();
    }

    @Override
    public void moveCenter(int offset) {
        tagGenerator.moveCenter(offset);
    }
}
