package structural.adapter.example;

public class JokerAdapter implements Figure {

    private Joker joker;

    public JokerAdapter(Joker joker) {
        this.joker = joker;
    }

    @Override
    public boolean move(int x, int y) {
        return joker.moveMe(x,y);
    }
}
