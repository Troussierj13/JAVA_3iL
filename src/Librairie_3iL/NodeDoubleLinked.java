package Librairie_3iL;

public class NodeDoubleLinked<E>{

    private E element;
    private NodeDoubleLinked<E> previous;
    private NodeDoubleLinked<E> next;

    public NodeDoubleLinked() {
        element = null;
        next = null;
    }

    public NodeDoubleLinked(E e) {
        element = e;
        next = null;
    }

    public NodeDoubleLinked(E e, NodeDoubleLinked<E> node) {
        element = e;
        next = node;
    }

    public E getElement() {
        return element;
    }

    public NodeDoubleLinked<E> getNext() {
        return next;
    }

    public void setElement(E e) {
        element = e;
    }

    public void setNext(NodeDoubleLinked<E> node) {
        next = node;
    }

    public NodeDoubleLinked<E> getPrevious() {
        return previous;
    }

    public void setPrevious(NodeDoubleLinked<E> node) {
        previous = node;
    }
}
