package bank;

public class Bank {

    public void profession(Person person) {
        System.out.println(person.getName() + "进入银行");
        person.callNumber();
        person.transact();
        person.leave();
    }
}
