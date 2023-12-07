package structural.wrapper;

public class ItemWrapper implements Item {

    private Item item;

    public ItemWrapper(Item item) {
        this.item = item;
    }

    @Override
    public void use() {
        item.use();
    }

}
