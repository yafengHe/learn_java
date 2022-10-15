public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main main = new Main();
        System.out.println(main.fibonacci(6));
        final int a;
        a = 10;
        System.out.println(a);
    }

    public int fibonacci(int n) {
        // 1 1 2 3 5 8 13
        // n表示当前第几项

        // 前两项为1
        if (n == 1 || n == 2) {
            return 1;
        } else {
            // 第三项开始 数字都是前2项之和
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}