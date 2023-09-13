package structural.wrapper;

public class WorkerWrapper implements Workable {
    //1. Wrapper opakowuje obiekt (przechowuje go)
    //2. Udaje obiekt (dziedziczenie/implementowanie wspólnego typu),
    //  bazowo - przekierowuje swoje działania do oryginalnego obiektu

    private Workable workable;

    public WorkerWrapper(Workable workable) {
        this.workable = workable;
    }

    @Override
    public void work() {
        workable.work();
    }
}
