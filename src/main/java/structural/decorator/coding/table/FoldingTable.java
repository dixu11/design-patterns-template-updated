package structural.decorator.coding.table;

import java.util.List;

public class FoldingTable extends TableDecorator {

    private boolean folded = true;

    public FoldingTable(Table table) {
      super(table);
    }


    public void fold() {
        if (!folded && getItems().size() > table.getItemLimit()) {
            System.out.println("Musisz najpierw zabrać przedmioty!");
            return;
        }
        folded = true;
        setMaxSize(3);
    }

    public void unfold() {
        folded = false;
        setMaxSize(5);
    }

}
