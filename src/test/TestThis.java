package test;

public class TestThis {
    public static void main(String[] args) {
        Person1 person1 = new Person1("Henry", 18);
        Person1 person2 = new Person1("张三", 187);
        System.out.println(person1.compareTo(person2));
    }
}

class Person1 {
    String name;

    int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean compareTo(Person1 p) {
        return this.name.equals(p.name) && this.age == p.age;
    }
}
