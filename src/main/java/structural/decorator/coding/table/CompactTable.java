package structural.decorator.coding.table;

import java.util.List;

public class CompactTable implements Table{

    private ClassicTable table;
    private boolean compacted = false;

    public CompactTable(ClassicTable table) {
        this.table = table;
    }

    @Override
    public void putOnTable(Object item) {
        table.throwIfSize(getItemLimit());
        table.add(item);
    }

    @Override
    public List<Object> getItems() {
        return table.getItems();
    }

    @Override
    public int getItemLimit() {
        return compacted ? 0: table.getItemLimit();
    }

    @Override
    public Object removeLastItem() {
        return table.removeLastItem();
    }

   public void compact() {
        if (!table.getItems().isEmpty()) {
            throw new IllegalStateException("Before compacting remove all items");
        }
        compacted = true;
    }

    public void uncompact() {
        compacted = false;
    }
}
