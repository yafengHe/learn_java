package exam;

import java.util.Arrays;

public class Exam01 {
    private int[] arr = new int[20];

    private int avarage;

    public static void main(String[] args) {
        Exam01 exam01 = new Exam01();
        exam01.test01();
        exam01.test02();
        exam01.test03();
        exam01.test04();
    }

    /**
     * 1.生成20个取值范围在0-20（包含20）之间的随机数，并将其存放到数组中
     */
    public void test01() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 20);
        }
        System.out.println(Arrays.toString(this.arr));
    }

    /**
     * 2.求数组中这20个随机数的总和和平均数，平均数取整即可，不考虑小数点
     */
    public void test02() {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        this.avarage = sum / arr.length;
        System.out.println("总和为：" + sum);
        System.out.println("平均值为" + this.avarage);
    }

    /**
     * 3.采用排序算法，这20 个整数按照从小到大排序后输出（自己写排序算法,不要调用Arrays的方法。）
     */
    public void test03() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        };
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 4.实现对排序后的数字进行出现次数的统计，要求输出的顺序和排序的顺序一致，请参考效果图(不使用集合的情况)
     */
    public void test04() {
        int[] newArr = arr;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int k : arr) {
                if (arr[i] == k) {
                    count++;
                }
                if (count > 1) {
                    newArr[i] = -1;
                }
            }
            if (newArr[i]!= -1) {
                System.out.println(arr[i] + "出现:" + count + "次");
            }
        }
    }

}
