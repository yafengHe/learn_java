package relations;

public class Student {
//    学生的名字
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 学生使用电脑
    public void userCompuer(Computer computer) {
        System.out.println(this.name + "开始使用电脑");
        computer.beOpen();
        computer.useing();
        computer.beClosed();
    }
}
