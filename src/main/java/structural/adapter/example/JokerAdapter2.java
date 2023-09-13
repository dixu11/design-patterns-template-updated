package structural.adapter.example;

public class JokerAdapter2 extends Joker implements Figure {

    public JokerAdapter2(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean move(int x, int y) {
        return moveMe(x, y);
    }
}
