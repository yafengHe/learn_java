package singleton;

public class SingleTon {
    private static SingleTon single;

    private SingleTon() {
    }

    public static SingleTon getSingleTon() {
        if (single == null) {
            single = new SingleTon();
        }
        return single;
    }
}
