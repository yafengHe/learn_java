package homework;

/**
 * 编写类A01, 定义方法max, 实现求某个double数组的最大值, 并返回
 */
public class A01 {
    public Double max(double[] d) {
        if (d != null && d.length > 0) {
            double maxNum = d[0];
            for (int i = 0; i < d.length; i++) {
                if (maxNum < d[i]) {
                    maxNum = d[i];
                }
            }
            return maxNum;
        } else {
            return null;
        }
    }

    /**
     * 查找某个字符串的索引
     * @param str 字符串数组
     * @param s 要查找的字符串
     * @return 找到返回所在位置的索引，没找到返回-1
     */
    public int find(String[] str, String s) {
        int idx = -1;
        for (int i = 0; i < str.length; i++) {
            if (s.equals(str[i])) {
                idx = i;
                break;
            }
        }
        return idx;
    }

    /**
     * 实现数组的复制
     * @param arr 要复制的数组
     * @return 返回新数组
     */
    public int[] copyArr(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public double compareMax(double x, double y) {
        return Math.max(x, y);
    }
}
