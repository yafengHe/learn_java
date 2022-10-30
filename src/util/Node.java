package util;

public class Node {

    /** 上一个node对象 */
    public Node prev;

    /** 当前数据 */
    public int item;

    /** 下一个node对象 */
    public Node next;

    public Node(Node prev, int item, Node next) {
        this.prev = prev;
        this.item = item;
        this.next = next;
    }
}
