package structural.decorator.coding.table;

import java.util.List;

class TableDecorator implements Table{

    protected Table table;
    private TableParams tableParams;

    public TableDecorator(Table table) {
        this.table = table;
        if (table instanceof ModifiableTable) {
            ModifiableTable modifiable = (ModifiableTable) table;
            tableParams = modifiable.getModifiableTableData();
        }
    }

    @Override
    public void putOnTable(Object item) {
        table.putOnTable(item);
    }

    @Override
    public List<Object> getItems() {
        return table.getItems();
    }

    @Override
    public int getItemLimit() {
        return table.getItemLimit();
    }

    @Override
    public Object removeLastItem() {
        return table.removeLastItem();
    }

    protected void setMaxSize(int size) {
        tableParams.setMaxSize(size);
    }
}
