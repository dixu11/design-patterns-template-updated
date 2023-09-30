package behavioral.visitator;

public abstract class Card {

    public abstract double accept(Visitor visitor);
    public double getBase() {
        return 10 ;
    }
}

class BronzeCard extends Card {

    @Override
    public double accept(Visitor visitor) {
      return   visitor.calculatePoints(this);
    }
}

class SilverCard extends Card {

    @Override
    public double accept(Visitor visitor) {
       return visitor.calculatePoints(this);
    }
}

class GoldCard extends Card {

    @Override
    public double accept(Visitor visitor) {
       return visitor.calculatePoints(this);
    }
}
