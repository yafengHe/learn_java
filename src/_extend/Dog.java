package _extend;

public class Dog extends Person {
    public Dog() {
    }

    public Dog(String name, String age) {
        super(name, age);
    }

    public void getInfo() {
        System.out.println("dog" + name + "---" + "age");
    }
}
