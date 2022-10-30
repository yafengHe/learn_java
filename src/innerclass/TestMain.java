package innerclass;

public class TestMain {
    public static void main(String[] args) {
        Demo demo = new Demo();
        Demo.InnerDemo innerDemo = demo.new InnerDemo();
        innerDemo.testInnerDemo();

        innerclass.Test t = () -> System.out.println("匿名内部类");
        t.test();

    }
}
