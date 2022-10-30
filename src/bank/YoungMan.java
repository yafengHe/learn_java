package bank;

public class YoungMan extends Person {
    public YoungMan(String name) {
        this.name = name;
    }

    public YoungMan() {
    }

    public void callNumber() {
        System.out.println("年轻人叫号");
    }

    public void transact() {
        System.out.println("年轻人取钱");
    }

    public void leave() {
        System.out.println("年轻人离开");
    }
}
