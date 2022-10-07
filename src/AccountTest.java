public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("李银河", 15, "111111");
        account.setName("张三");
        account.setBalance(40.5);
        account.setPassword("666666");
        account.getInfo();
    }
}

/**
 * 要求：
 * 具有属性：姓名：长度为2位3位4位，余额:必须>20 密码：必须6位
 */
class Account {
    private String name;
    private double balance;
    private String password;

    public Account(String name, double balance, String password) {
//        this.name = name;
//        this.balance = balance;
//        this.password = password;
        setName(name);
        setBalance(balance);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("姓名长度必须为2位3位4位");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额必须大于20");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() != 6) {
            System.out.println("密码长度必须为6");
        } else {
            this.password = password;
        }
    }

    public void getInfo() {
        System.out.println("姓名：" + name + "\t 余额：" + balance + "\t密码：" + password);
    }
}
