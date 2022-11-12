package thread.system12306;

public class TestMain {
    public static void main(String[] args) {
        Window w1 = new Window("武汉站");
        Window w2 = new Window("武汉西站");
        Window w3 = new Window("武汉东站");
        w1.start();
        w2.start();
        w3.start();
    }
}
