package structural.wrapper;

public class WrapperDemo {
    public static void main(String[] args) {
        Workable worker = new Worker("Jan");
        worker.work();

        Workable wrapper = new WorkerWrapper(worker);
        wrapper.work();
    }
}
