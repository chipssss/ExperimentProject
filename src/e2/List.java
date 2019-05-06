package e2;

/**
 * @author: chips
 * @date: 2019-05-06
 * @description:
 **/
public interface List<T> {
    void add(T data);

    T remove(int position);

    T get(int position);

    void set(int position, T data);

    boolean isEmpty();

    int size();

    String toString();

    int insert(int i, T x);

    int insert(T x);

    void clear();

    int search(T key);

    boolean contains(T key);

    int insertDifference(T x);

    T remove(T key);

    boolean equals(Object obj);

    void addAll(List<T> list);
}
