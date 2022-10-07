package _extend;

public class TestExtend {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "猫";
        cat.age = "10";
        cat.getInfo();

        Dog dog = new Dog();
        dog.name = "狗";
        dog.age = "20";
        dog.getInfo();
    }
}
