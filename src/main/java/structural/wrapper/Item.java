package structural.wrapper;

public class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public void use() {
        System.out.println("Działanie bazowe obiektu o nazwie: " + name);
    }
}

class Demo{
    public static void main(String[] args) {
        Item item = new Item("Zwykły Item");
        ItemWrapper itemWrapper = new ItemWrapper();
        useItem(itemWrapper);
    }


    public static void useItem(Item item) {
        System.out.println("Używam: " + item);
        item.use();
    }
}
