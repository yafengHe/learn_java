package _extend;

public class Cat extends Person{
    public Cat() {
    }

    public Cat(String name, String age) {
        super(name, age);
    }

    public void getInfo() {
        System.out.println("cat---" + name + "---" + age);
    }
}
