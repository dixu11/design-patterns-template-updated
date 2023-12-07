package creational.factoryMethod;

public class Main {
    public static void main(String[] args) {
        //wykorzystaj stworzone klasy aby niżej napisany kod kompilował się a program drukował oczekiwany rezultat
        //nie możesz modyfikować kodu w tej klasie
        //wykorzystaj prostą implementację wzorca Factory Method

      /* Character mage = new Mage("Gandalf");
        mage.attack();
        Character fighter = new Fighter("Spartacus");
        fighter.attack();*/
    }

    /*
    * OCzekiwany wydruk z konsoli:
    * "Gandalf strzela za pomocą różdżki!"
    * "Spartacus tnie za pomocą miecza!"
    * */


    /*
    * 1. obiekt broni tworzony w metodzie attack
    * 2. obiekt broni dostarczany przez konstruktor (default dostęp) w  Character
    * */
}
