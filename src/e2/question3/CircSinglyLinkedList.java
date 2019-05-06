package e2.question3;

import e2.List;
import e2.Node;

/**
 * @author: chips
 * @date: 2019-05-06
 * @description:
 **/
public class CircSinglyLinkedList<T> implements List<T> {
    private Node<T> head;
    private Node<T> rear;

    public CircSinglyLinkedList() {
        this(null);
    }

    public CircSinglyLinkedList(T[] value) {
        head = new Node<>(null, null);
        rear = new Node<>(null, head);
        Node<T> p = head;
        for (T t : value) {
            p.next = new Node<>(t, null);
            p = p.next;
        }

        p.next = rear;
    }

    @Override
    public void add(T data) {
        Node<T> p = new Node<>(data, head);
        rear.next = p;
        rear = p;
    }

    @Override
    public T remove(int position) {

        Node<T> front = head;

        for (int i = 0; i < position && front.next != rear; i++) {
            front = front.next;
        }

        if (front.next == rear || position < 0) {
            return null;
        }

        T old = front.next.data;
        front.next = front.next.next;
        return old;
    }

    @Override
    public T get(int position) {
        return null;
    }

    @Override
    public void set(int position, T data) {

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
}
