package structural.decoratorExample.html;

public interface TagGenerator {

     void addTags();

    void putInside(String tag);

    String getContent();

    int getCenter();

    void moveCenter(int offset);

}
