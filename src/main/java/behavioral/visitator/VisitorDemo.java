package behavioral.visitator;

public class VisitorDemo {
    public static void main(String[] args) {
        //double dispatch - mechanizm polimorfizmu który uwzględnia
        // kombinowane zachowanie klas z dwóch różnych hierarchii
        //baza 10
        Card gold = new GoldCard();
        Card silver = new SilverCard();
        Card bronze = new BronzeCard();

        Visitor taxiVisitor = new TaxiVisitor();  //* 1.5  B:1 S:*3 G:*10
        Visitor cinemaVisitor = new CinemaVisitor();// * 3  B:*2 S:*4 G:*15

        System.out.println(gold.accept(taxiVisitor));
        System.out.println(silver.accept(taxiVisitor));
        System.out.println(bronze.accept(taxiVisitor));

        System.out.println(gold.accept(cinemaVisitor));
        System.out.println(silver.accept(cinemaVisitor));
        System.out.println(bronze.accept(cinemaVisitor));



//        gold.calculatePoints(taxiVisitor);
//        taxiVisitor.calculatePoint(gold);


    }
}
