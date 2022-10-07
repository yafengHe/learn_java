package homework;

public class Cale {

    public int add(int x, int y) {
        return x + y;
    }

    public int minus(int x, int y) {
        return x - y;
    }

    public int mutilpy(int x, int y) {
        return x * y;
    }

    public int devide(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return x / y;
    }
}
