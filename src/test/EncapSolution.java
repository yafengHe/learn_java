package test;

public class EncapSolution {
    public static void main(String[] args) {
        PersonObj personObj = new PersonObj("向三", 121, 121.11);
        personObj.setName("李银河");
        personObj.setAge(166);
        personObj.setSalary(10240.1024);
        personObj.getInfo();
    }
}

class PersonObj {
    public String name;
    private int age;
    private double salary;

    public PersonObj() {
    }

    public PersonObj(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//        防止通过构造器传参的时候改值 所以直接调用set方法
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >=1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄有误");
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void getInfo() {
        System.out.println("名字:" + name + "" +
                "\t年龄:" + age + "\t薪水:" + salary);
    }
}