package util;

public class LinkedBox implements Box {
    /** 记录首节点 */
    private Node first;

    /** 记录尾节点 */
    private Node last;

    /** 记录有效的元素个数 */
    private int size;


    /**
     * 将元素添加在新的node里，挂在链表的尾端
     * @param element 元素
     */
    private void linkLast(int element) {
        // 获取链表的尾节点
        Node l = last;
        // 创建一个新的node对象 将新数据包装起来
        Node newNode = new Node(l, element, null);
        // 将新节点对象设置为尾节点
        last = newNode;

        // 如果原来的尾节点没有对象 证明这个链表没有使用过
        if (l ==null) {
            first = newNode;
        } else {
            // 原来使用过 将新的节点连接在last之后
            l.next = newNode;
        }
        // 有效元素个数+1
        size++;
    }

    /**
     * 检查给定的index是否合法
     * @param index 索引
     */
    private void rangeCheck(int index) {
        if (index < 0 && index >= size) {
            // 自定义异常
            throw new BoxIndexOutOfBoundsException("index:" + index + "，size:" + size);
        }
    }

    /**
     * 负责找寻指定index位置的node对象
     * @param index 索引
     * @return node节点
     */
    private Node node(int index) {
        // 用于用来存储找到的当前目标
        Node targetNode;
        // 判断index范围是在前半部分还是后半部分
        if (index < (size >> 1)) {
            // 从前往后找比较快
            targetNode = first;
            for (int i = 0; i < index; i++) {
                targetNode = targetNode.next;
            }
        } else {
            // 从后往前找
            targetNode = last;
            for (int i = size - 1; i > index; i--) {
                targetNode = targetNode.prev;
            }
        }

        return targetNode;
    }

    /**
     * 将给定的node节点对象删除，并且保留数据
     * @param targetNode 节点
     * @return
     */
    private int unlink(Node targetNode) {
        // 当前的node item信息
        int oldValue = targetNode.item;
        // 当前node节点的前一个
        Node prev = targetNode.prev;
        // 当前node节点的下一个
        Node next = targetNode.next;
        // 删除节点对象
        if(prev==null) {
            // 当前node节点是第一个
            first = next;
        } else {
            prev.next = next;
            targetNode.prev = null;
        }

        if (next==null) {
            // 当前node节点是最后一个
            last = prev;
        } else {
            next.prev = prev;
            targetNode.next = null;
        }

        // 让有效元素-1
        size--;
        return oldValue;
    }


    /**
     * @param element 要添加的元素
     * @return 是否添加成功
     */
    @Override
    public boolean add(int element) {
        // 将element存入一个新的Node对象里 添加至链表的尾端
        this.linkLast(element);
        return true;
    }

    @Override
    public int get(int index) {
        // 检查索引是否合法
        this.rangeCheck(index);
        // 找寻index对应的下标的node对象 将对象的数据取出来
        Node node = this.node(index);
        // 返回找到的node内的数据
        return node.item;
    }

    @Override
    public int remove(int index) {
        // 检查索引是否合法
        this.rangeCheck(index);
        // 找寻index对应的下标的node对象 将对象的数据取出来
        Node targetNode = this.node(index);
        int oldValue = this.unlink(targetNode);
        return oldValue;
    }

    @Override
    public int size() {
        return size;
    }
}
