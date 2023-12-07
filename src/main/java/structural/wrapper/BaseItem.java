package structural.wrapper;


public class BaseItem implements Item{
    private String name;

    public BaseItem(String name) {
        this.name = name;
    }

    @Override
    public void use() {
        System.out.println("Działanie bazowe obiektu o nazwie: " + name);
    }
}

class Demo{
    public static void main(String[] args) {
        BaseItem baseItem = new BaseItem("Zwykły Item");
        ItemWrapper itemWrapper = new ItemWrapper();
        useItem(itemWrapper);
    }


    public static void useItem(Item item) {
        System.out.println("Używam: " + item);
        item.use();
    }
}
