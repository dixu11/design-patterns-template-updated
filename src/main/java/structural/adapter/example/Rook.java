package structural.adapter.example;

public class Rook implements Figure {

    private int x;
    private int y;

    public Rook(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean move(int x, int y) {
        return this.x == x ^ this.y == y;
        // return  Boolean.logicalXor(this.x == x, this.y == y);
        // return (this.x == x && this.y != y) || (this.x != x && this.y == y);
    }

}
