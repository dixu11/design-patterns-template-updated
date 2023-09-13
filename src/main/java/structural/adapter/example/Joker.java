package structural.adapter.example;

public  class Joker {

    private int x;
    private int y;

    public Joker(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean moveMe(int x, int y) {
        return Math.abs(this.x - x) == 2 && this.y == y ||
                Math.abs(this.y - y) == 2 && this.x == x;
    }
}
