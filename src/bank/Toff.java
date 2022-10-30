package bank;

public class Toff extends Person {
    public Toff() {
    }

    public Toff(String name) {
        this.name = name;
    }

    public void callNumber() {
        System.out.println("土豪叫号");
    }

    public void transact() {
        System.out.println("土豪取钱");
    }

    public void leave() {
        System.out.println("土豪离开");
    }
}
