package homework;

public class Dog {
    String name;

    String color;

    int age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color =color;
        this.age = age;
    }

    public void show() {
        System.out.println(this.name + "-" + this.color + "-" + this.age);
    }
}
