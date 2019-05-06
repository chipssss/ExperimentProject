package e2.question1;

import e2.List;

/**
 * @author: chips
 * @date: 2019-05-06
 * @description:
 **/
public class SeqSortedList<T> implements List<T> {
    private Object[] element;
    protected int length;

    public SeqSortedList() {
        this(64);

    }

    public SeqSortedList(int size) {
        element = new Object[size];
    }

    public SeqSortedList(T[] data){
        // todo 需要对data进行预排序
        if (!(data[0] instanceof Comparable)) {
            throw new IllegalArgumentException("该数据类型未实现Comparable接口");
        }

        element = new Object[data.length];
        for (int i = 0; i < element.length; i++) {
            element[i] = data;
        }

        length = data.length;
    }

    @Override
    public void add(T data) {
        if (!(data instanceof Comparable)) {
            throw new IllegalArgumentException("该数据类型未实现Comparable接口");
        }

        // 遍历寻址
        int i;
        for (i = 0; i < length ; i++) {
            if (((Comparable)element[i]).compareTo(data) > 0) {
                break;
            }
        }

        // 扩容
        if (element.length <= length) {
            Object[] temp = element;
            element = new Object[length*2];
            for (int j = 0; j < i; j++) {
                element[j] = temp[j];
            }
        }

        // 元素后移
        for (int j = length; j > i; j--) {
            element[j] = element[j-1];
        }

        element[i] = data;
        length ++;
    }

    @Override
    public T remove(int position) {
        if (position < 0 || position > length) {
            return  null;
        }

        Object result = element[position];
        for (int i = position; i < length; i++) {
            element[i] = element[i+1];
        }
        length --;
        return (T) result;
    }

    @Override
    public T get(int position) {
        if (position < 0 || position > length) {
            return  null;
        }

        return (T)(element[position]);
    }

    @Override
    public void set(int position, T data) {
        if (position < 0 || position > length) {
            return;
        }

        element[position] = data;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer("{");
        for (int i = 0; i < length; i++) {
            buffer.append(element[i].toString()).append(",");
        }
        buffer.setCharAt(buffer.length()-1, '}');
        return buffer.toString();
    }

    @Override
    public int insert(int i, T x) {
        return 0;
    }

    @Override
    public int insert(T x) {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public int search(T key) {
        return 0;
    }

    @Override
    public boolean contains(T key) {
        return false;
    }

    @Override
    public int insertDifference(T x) {
        return 0;
    }

    @Override
    public T remove(T key) {
        return null;
    }

    @Override
    public void addAll(List<T> list) {

    }

    public static void main(String[] args) {
        List<Integer> sortList = new SeqSortedList<>();
        sortList.add(1);
        sortList.add(-1);
        sortList.add(0);

        sortList.remove(1);


        System.out.println(sortList.toString());
    }
}
