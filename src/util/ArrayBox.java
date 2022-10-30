package util;

public class ArrayBox {

    /** 设置一个静态常量 用于存储数组的默认长度 */
    private static final int DEFAULT_CAPACITY = 10;

    /** 用于存放真实数据 */
    private int[] elementData;

    /** 用于记录数组内记录的有效元素的个数 */
    private int size = 0;

    public ArrayBox() {
        elementData = new int[DEFAULT_CAPACITY];
    }

    /**
     * 构造方法的重载 传入多少容量就设置为默认容量
     * @param capacity 需要的容量
     */
    public ArrayBox(int capacity) {
       elementData = new int[capacity];
    }

    /**
     * 确保数组内的容量
     * @param minCapacity 最小容量
     */
    private void ensureCapacityInternal(int minCapacity) {
        // 如果需要的容量比原数据的长度还要大 则要对原数组进行扩容
        if (minCapacity < elementData.length) {}
    }

    /**
     * 负责计算扩容大小
     * @param minCapacity 最小容量
     */
    private void grow(int minCapacity) {
        // 原数组长度
        int oldCapacity = elementData.length;
        // 定义新数组 在原数组上增加1.5倍
        int newCapacity = oldCapacity + (oldCapacity >> 1);

        // 比较扩容后的长度和需要的长度
        if (newCapacity - minCapacity < 0) {
            // 如果扩容后的长度不够所需要的长度。 将新数组的长度设置为需要的长度
            newCapacity = minCapacity;
        }
        elementData = this.copyOf(elementData, newCapacity);
    }

    /**
     * 将原数组中的所有元素移入新数组
     * @param oldArray 久数组
     * @param newCapacity 新数组的长度
     * @return
     */
    private int[] copyOf(int[] oldArray, int newCapacity) {
        // 根据提供的长度创建一个新数组
        int[] newArray = new int[newCapacity];
        // 将原数组中的元素按照位置移入新数组
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        // 返回薪数组
        return newArray;
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
     * 用于将用户给定的元素存起来
     * @param element 需要存的元素
     * @return 是否存储成功
     */
    public boolean add(int element) {
        // 确保数组的内容容量够用
        this.ensureCapacityInternal(size + 1);
        // 能执行到这里  说明elementData的数组肯定够用

        // 将新的element存入数组中 并让size多记录一个
        elementData[size++] = element;
        return true;
    }

    /**
     * 用于获取指定元素位置的元素
     * @param index 索引
     * @return 取得的元素
     */
    public int get(int index) {
        // 校验传入的索引的合法性
        this.rangeCheck(index);

        // 返回指定索引的元素
        return elementData[index];
    }

    /**
     * 用于删除给定位置的元素
     * @param index 索引位置
     * @return 删除掉的元素
     */
    public int remove(int index) {
        // 校验传入的索引的合法性
        this.rangeCheck(index);
        // 指定索引的元素并存储
        int oldValue = elementData[index];

        // 从index位置开始 直接size-1结束 后面元素依次往前覆盖
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i+1];
        }
        // 因为经过上诉操作后 数组最后一个还空着 多一个位置。手动删除最后一个元素 让size减少一个记录
        elementData[--size] = 0;

        // 返回删除掉的元素
        return oldValue;
    }

    /**
     * 用来获取有效size的个数
     * @return 有效的size个数
     */
    public int size() {
        return size;
    }
}
