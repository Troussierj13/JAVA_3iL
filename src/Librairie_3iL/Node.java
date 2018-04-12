package Librairie_3iL;

public class Node<E> {
    private E element;
    private Node<E> next;

    public Node() {
        element = null;
        next = null;
    }

    public Node(E e) {
        element = e;
        next = null;
    }

    public Node(E e, Node<E> node) {
        element = e;
        next = node;
    }

    public E getElement() {
        return element;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setElement(E e) {
        element = e;
    }

    public void setNext(Node<E> node) {
        next = node;
    }
}
