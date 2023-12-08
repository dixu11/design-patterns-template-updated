package structural.decoratorExample.html;

public class BodyTagDecorator extends AbstractTagDecorator {


    public BodyTagDecorator(AbstractTagGenerator tagGenerator) {
        super(tagGenerator);
    }

    @Override
    public void addTags() {
        super.addTags();
        putInside("<html></html>");
       // moveCenter();
    }
}
