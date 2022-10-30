package bank;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Person oldMan = new OldMan("老人");
        bank.profession(oldMan);

        System.out.println("-----------------------------------");
        Person youngMan = new YoungMan("年轻人");
        bank.profession(youngMan);

        System.out.println("-----------------------------------");
        Person toff = new Toff("土豪");
        bank.profession(toff);
    }
}
