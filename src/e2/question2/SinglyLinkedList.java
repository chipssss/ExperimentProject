package e2.question2;

import e2.Node;

/**
 * @author: chips
 * @date: 2019-05-06
 * @description:
 **/
public class SinglyLinkedList<T>{
    Node<T> head;


    public SinglyLinkedList(T[] data) {
        this();
        Node<T> front = head;

        for (int i = 0; i < data.length; i++) {
            front.next = new Node<>(data[i], null);
            front = front.next;
        }
    }

    public SinglyLinkedList() {
        head = new Node<>(null, null);
    }

    public SinglyLinkedList(SinglyLinkedList<T> data) {
        this();
        head = data.head;
    }

    public Node<T> search(T element) {
        Node<T> p = head.next;
        if (p == null) {
            return null;
        }

        do {
            if (element.equals(p.data)) {
                return p;
            }
            p = p.next;
        } while (p.next != null);
        return null;
    }

    public void concat(SinglyLinkedList<T> data) {
        Node<T> p = head;

        while(p.next != null) {
            p = p.next;
        }

        p.next = data.head.next;
    }

    public boolean remove(T data) {
        Node<T> front = head;
        Node<T> p = front.next;

        if (p == null) {
            return false;
        }

        do {
            if (p.data.equals(data)) {
                front.next = p.next;
                return true;
            }
            p = p.next;
            front = front.next;
        } while (p.next != null);

        return false;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer("{");
        Node<T> p = head.next;

        while(p != null) {
            buffer.append(p.data).append(",");
            p = p.next;
        }
        buffer.setCharAt(buffer.length()-1, '}');
        return buffer.toString();
    }


    public static void main(String[] args) {
        Integer[] data = {1, 2, 3, 4};
        Integer[] test = {2, 3, 4, 5};
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>(data);

        System.out.println("new SinglyLinkedList: " + list);

        list.concat(new SinglyLinkedList<>(test));
        System.out.println("concat list test:" + list);

        list.remove(1);
        System.out.println("remove value 1:" + list);

        System.out.println("search element 1:" + list.search(1));
        System.out.println("search element 2:" + list.search(2));
    }
}
