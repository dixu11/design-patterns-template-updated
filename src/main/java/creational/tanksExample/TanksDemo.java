package creational.tanksExample;

public class TanksDemo {
    public static void main(String[] args) {
        Tank tank1 = new LeftTank();
        Tank tank2 = new RightTank();
        tank1.shot(); // shoots right
        tank2.shot(); // shoots left
    }
}
