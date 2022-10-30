package util;

public interface Box {

    /**
     * @param element 要添加的元素
     * @return 是否添加成功
     */
    public boolean add(int element);

    public int get(int index);

    public int remove(int index);

    public int size();

}
