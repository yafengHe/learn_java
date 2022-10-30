package bank;

public class OldMan extends Person {

    public OldMan() {
    }

    public OldMan(String name) {
        this.name = name;
    }

    public void callNumber() {
        System.out.println("老人叫号");
    }

    public void transact() {
        System.out.println("老人取钱");
    }

    public void leave() {
        System.out.println("老人离开");
    }
}
