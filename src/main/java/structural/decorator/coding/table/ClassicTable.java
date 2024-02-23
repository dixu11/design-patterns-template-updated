package structural.decorator.coding.table;


import java.util.*;

public class ClassicTable implements Table, ModifiableTable {
    private LinkedList<Object> items = new LinkedList<>();
    private TableParams tableParams = new TableParams(3);
    @Override
    public void putOnTable(Object item) {
        if (items.size() >= getItemLimit()) {
            throw new IllegalStateException("Table is full. Max items: " + getItemLimit());
        }
        items.add(item);
    }



    @Override
    public List<Object> getItems() {
        return Collections.unmodifiableList(items);
    }

    @Override
    public int getItemLimit() {
        return tableParams.getMaxSize();
    }

    @Override
    public Object removeLastItem() {
        return items.removeLast();
    }

    @Override
    public TableParams getModifiableTableData() {
        return tableParams;
    }
}
