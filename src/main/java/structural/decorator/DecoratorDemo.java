package structural.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        //https://www.journaldev.com/1540/decorator-design-pattern-in-java-example przykład implementacji wzorca

        /*Zaimplementuj wzorzec dekorator aby rozszerzyć zachowania obiektu podstawowego drzewka*/

        //standardowe zachowanie bez dekoratora
        ChristmasTree simpleTree = new ChristmasTreeImpl();
        System.out.println(simpleTree.getDecoratedTree());

        /*Twój kod przygotowujący drzewko świąteczne udekorowane światełkami*/
        //System.out.println(treeWithLights.getDecoratedTree());
        // -> ma drukować "świąteczne drzewko ze światełkami

        /*Twój kod przygotowujący drzewko świąteczne udekorowane bombkami i światełkami*/
        //System.out.println(treeWithBaublesAndLights.getDecoratedTree());
        // -> ma drukować "świąteczne drzewko ze światełkami z bombkami"

        //System.out.println(treeWithLights.getLightsColor());
        // -> ma drukować kolor światełek

    }
}
