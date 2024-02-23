package structural.decorator.coding.table;

import java.util.List;

public interface Table {
    void putOnTable(Object item);

    List<Object> getItems();

    int getItemLimit();

    Object removeLastItem();
}
