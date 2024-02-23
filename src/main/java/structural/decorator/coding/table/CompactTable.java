package structural.decorator.coding.table;

import java.util.List;

public class CompactTable extends TableDecorator{
    private boolean compacted = false;

    public CompactTable(Table table) {
        super(table);
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
