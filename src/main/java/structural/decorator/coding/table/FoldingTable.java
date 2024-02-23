package structural.decorator.coding.table;

import java.util.List;

public class FoldingTable implements Table {

    private ClassicTable table;
    private boolean folded = true;

    public FoldingTable(ClassicTable table) {
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
        return folded ? table.getItemLimit() : table.getItemLimit() + 2;
    }

    @Override
    public Object removeLastItem() {
        return table.removeLastItem();
    }

    public void fold() {
        if (getItems().size() > table.getItemLimit()) {
            System.out.println("Musisz najpierw zabrać przedmioty!");
            return;
        }
        folded = true;
    }

    public void unfold() {
        folded = false;
    }

}
