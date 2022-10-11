package relations;

public class Computer {
    // 电脑编号
    private int number;
    // 电脑的属性 表示自己的状态  是开着的还是关着的
    private boolean used = false;// true 开着的 false 关着的

    public Computer() {
    }

    public Computer(int number, boolean used) {
        this.number = number;
        this.used = used;
    }
    public void beOpen() {
        this.used = true;
        System.out.println(this.number + "号电脑打开了");
    }

    public void beClosed() {
        this.used = false;
        System.out.println(this.number + "号电脑关闭了");
    }

    public void useing() {
        System.out.println(this.number + "号电脑正在使用中");
    }
}
