package homework;

import java.util.Scanner;

public class ExchangeArray {
    public static void main(String[] args) {
        ExchangeArray exchangeArray = new ExchangeArray();
//        int[] a = {1, 2, 3, 4};
//        int[] b = {5, 6, 7, 8};
//        方法1：直接改变数组地址的值
//        exchangeArray.exchangeArrayWithValue(a, b);

//        // 方法二：改变数组的引用地址，引用地址互相改变，
//        // 因为方法调用的时候才创建，不调用了会销毁，地址对应的值不会改变，所以返回出来。所以需要返回值。
//        int[][] ints = exchangeArray.exchangeArrayWithInstance(a, b);
//        a = ints[0];
//        b = ints[1];
//        for (int i : a) {
//            System.out.println(i);
//        }
//        System.out.println("-------------------");
//        for (int j : b) {
//            System.out.println(j);
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = scanner.nextLine();
        System.out.println("请输入密码");
        Scanner scanner1 = new Scanner(System.in);
        String pwd = scanner1.nextLine();
        String loginInfo = exchangeArray.validLogin(username, pwd);
        System.out.println(
                loginInfo
        );
    }

    /**
     * 交换两个长度相同的数组
     *
     * @param a 数组a
     * @param b 数组b
     */
    public void exchangeArrayWithValue(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            int x = a[i];
            a[i] = b[i];
            b[i] = x;
        }
    }

    /**
     * 交换两个数组
     *
     * @param a
     * @param b
     * @return
     */
    public int[][] exchangeArrayWithInstance(int[] a, int[] b) {
        int[] temp = a;
        a = b;
        b = temp;
        return new int[][]{a, b};
    }

    public String validLogin(String username, String pwd) {
        String[][] userBox = {{"小何", "admin", "123456"}, {"小何2", "admin2", "1234562"}};
        for (int i = 0; i < userBox.length; i++) {
            if (username.equals(userBox[i][1])) {
                if (pwd.equals(userBox[i][2])) {
                    return "登录成功";
                } else {
                    return "账号或密码错误";
                }
            } else {
                return "账号或密码错误";
            }
        }

        return "账号或密码错误";
    }
}
