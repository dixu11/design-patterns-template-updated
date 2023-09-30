package behavioral.visitator;

public interface Visitor {
    //aby uzyskać wszystkie możliwe kombinacje wizytatorów i struktur
    double calculatePoints(BronzeCard card);

    double calculatePoints(SilverCard card);

    double calculatePoints(GoldCard card);

}

class TaxiVisitor implements Visitor {


    @Override
    public double calculatePoints(BronzeCard card) {
        return card.getBase() * 1.5;
    }

    @Override
    public double calculatePoints(SilverCard card) {
        return card.getBase() * 1.5 * 3;
    }

    @Override
    public double calculatePoints(GoldCard card) {
        return card.getBase() * 1.5 * 10;
    }
}

class CinemaVisitor implements Visitor {


    @Override
    public double calculatePoints(BronzeCard card) {
        return card.getBase() * 3 * 2;
    }

    @Override
    public double calculatePoints(SilverCard card) {
        return card.getBase() * 3 * 4;
    }

    @Override
    public double calculatePoints(GoldCard card) {
        return card.getBase() * 3 * 15;
    }
}
