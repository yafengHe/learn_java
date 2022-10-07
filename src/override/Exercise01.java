package override;

public class Exercise01 {
    public static void main(String[] args) {
        Person person = new Person("李银河", 18);
        System.out.println(person.say());

        Student student = new Student("小王", 20, 1, 20.5);
        System.out.println(student.say());
    }
}
