package innerclass;

public class Demo {
    private String name = "正常的类的属性";

    public void testDemo() {
        System.out.println("正常的类");
    }

    /**
     * 成员内部类
     */
    public class InnerDemo {
        public void testInnerDemo() {
            System.out.println("内部类的方法：" + name);
            testDemo();
        }
    }

    public void testDemoOne() {
        /**
         * 局部内部类
         */
        class InnerTestOneMethod {}
    }

    /**
     * 静态内部类
     */
    public static class InnerDemoStatic {

    }
}
