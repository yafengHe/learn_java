package test;

public class FinalAndStatic {
    public static int age;

    public static void main(String[] args) {
        FinalAndStatic finalAndStatic = new FinalAndStatic();
        finalAndStatic.test();
    }

    public void test() {
        age = 20;
        System.out.println(age);
    }
}
