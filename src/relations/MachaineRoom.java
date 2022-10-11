package relations;

public class MachaineRoom {

    // 机房和电脑是聚合关系 机房内有电脑
    public Computer computer = new Computer(1, false);

    // 机房和学生是依赖关系 机房欢迎学生来使用
    public void welcomeStudent(Student student) {
        String name = student.getName();
        System.out.println("欢迎" + name + "进入机房");
        student.userCompuer(computer);
    }
}
