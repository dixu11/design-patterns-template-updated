package structural.wrapper;

public class Worker implements Workable {

    private String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println(name + ": I'm working ");
    }
}
