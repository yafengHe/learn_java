public class ConstructorExercise {
    public static void main(String[] args) {
        Person p = new Person("13", 6);
        System.out.println(p.age);
        System.out.println(p.name);
    }
}

class Person {
    int age;

    String name;

    public Person() {
        age = 18;
    }

    public Person(String pName, int pAge) {
        age =pAge;
        name = pName;
    }
}
