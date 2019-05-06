package e2;

/**
 * @author: chips
 * @date: 2019-05-06
 * @description:
 **/
public class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
