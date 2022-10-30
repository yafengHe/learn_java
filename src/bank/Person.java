package bank;

public abstract class Person {
    protected String name;

    public String getName() {
        return this.name;
    }

    public abstract void callNumber();

    public abstract void transact();

    public abstract void leave();
}
