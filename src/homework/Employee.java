package homework;

public class Employee {
    String name;
     boolean sex;
     int age;
     String position;
     double salary;

     public Employee(String name, boolean sex, int age, String position, double salary) {
         this.name = name;
         this.sex = sex;
         this.age = age;
         this.position = position;
         this.salary = salary;
     }

    public Employee(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Employee(String position, double salary) {
        this.position = position;
        this.salary = salary;
    }
}
