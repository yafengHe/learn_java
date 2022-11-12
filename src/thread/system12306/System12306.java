package thread.system12306;

import java.util.Vector;

public class System12306 {
    private static System12306 sys = new System12306();

    private Vector<Ticket> tickets = new Vector<>();

//    系统创建后给tickets赋值
    {
        for (int i = 10; i < 100; i++) {
            tickets.add(new Ticket("武汉" + i, "荆州" + i, (i%5+5)*25F));
        }
    }

    private System12306() {}

    public static System12306 getInstance() {
        return sys;
    }

    public Ticket getTicket() {
        try {
            return tickets.remove(0);
        } catch (Exception e) {
            return null;
        }
    }

}
