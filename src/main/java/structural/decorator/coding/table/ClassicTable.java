package structural.decorator.coding.table;


import java.util.*;

public class ClassicTable implements Table {
    private LinkedList<Object> items = new LinkedList<>();
    @Override
    public void putOnTable(Object item) {
        throwIfSize(getItemLimit());
        add(item);
    }

    void throwIfSize(int size) {
        if (items.size() >= size) {
            throw new IllegalStateException("Table is full. Max items: " + size);
        }
    }

     void add(Object item) {
        items.add(item);
    }



    @Override
    public List<Object> getItems() {
        return Collections.unmodifiableList(items);
    }

    @Override
    public int getItemLimit() {
        return 3;
    }

    @Override
    public Object removeLastItem() {
        return items.removeLast();
    }
}
