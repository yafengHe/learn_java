public class OverLoadExercise {
    public static void main(String[] args) {
        OverLoadExercise overLoadExercise = new OverLoadExercise();
        System.out.println(overLoadExercise.m(2));
        System.out.println(overLoadExercise.m(2, 3));
        overLoadExercise.m("HelloWorld----------------");

        System.out.println(overLoadExercise.max(2, 4));
        System.out.println(overLoadExercise.max(4.4, 5,5));
        System.out.println(overLoadExercise.max(6.4, 5.5, 9.9));
    }

    public int m(int n) {
        return n * n;
    }

    public int m(int n1, int n2) {
        return n1 * n2;
    }

    public void m(String str) {
        System.out.println(str);
    }

    public int max(int a, int b) {
        return Math.max(a, b);
    }

    public double max(double d1, double d2) {
        return Math.max(d1, d2);
    }

    public double max(double d1, double d2, double d3) {
        return Math.max(Math.max(d1, d2), d3);
    }
}
