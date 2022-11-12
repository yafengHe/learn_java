package test;

/**
 * 迷宫
 */
public class MiGong {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
//        设置第一行和最后一行为1。 因为行数固定，所以map第一项可写死。
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }

//        设置最左边的一列和最右边的一列为1。列数固定，行数变化。
//        外层控制行数，所以map第一项是i，内层控制列表，总共7列，所以内存是6
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
//        设置第四行第二列为1
        map[3][1] = 1;
        //        设置第四行第三列为1
        map[3][2] = 1;

        T t = new T();
        t.findWay(map,1, 1);
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class T {
    /**
     * 1. 当[6][5]=2时  表示结束
     * @param map
     * @param i
     * @param j
     * @return
     */
    public boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
//            当前位置是0表示可以走
            if (map[i][j] == 0) {
//                默认可以走通 设置为2
                map[i][j] = 2;

//                设置行走策略是右下左上
//                向右
                if (findWay(map, i, j + 1)) {
                    return true;
                } else if (findWay(map, i + 1, j)) {
                    // 向下
                    return true;
                } else if (findWay(map, i, j -1)) {
//                    向左
                    return true;
                } else if (findWay(map, i - 1, j)) {
//                    向上
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}
