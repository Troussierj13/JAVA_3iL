package Librairie_3iL;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList3iL<E> implements Iterable<E>, IList<E> {

    private int size;
    private Node<E> head;
    private Node<E> end;

    public LinkedList3iL(){
        size = 0;
        head = null;
        end = null;
    }

    private Node<E> getNode(int index) {
        if(index >= size || index < 0) {
            return null;
        }

        Node<E> node = head;

        for(int i=0 ; i<index ; i++) {
            node = node.getNext();
        }

        return node;
    }

    @Override
    public boolean add(E e) {
        add(size, e);

        return true;
    }

    @Override
    public void add(int index, E e) {
        if(index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        Node<E> node = new Node<>(e);

        if(isEmpty()) {
            head = node;
            end = node;
        } else if(index == 0){
            addHead(node);
        } else if(index == size) {
            addEnd(node);
        } else {
            node.setNext(getNode(index));
            getNode(index-1).setNext(node);
        }

        size++;
    }

    private void addHead(@NotNull Node<E> node) {
        node.setNext(head);
        head = node;
    }

    private void addEnd(@NotNull Node<E> node) {
        end.setNext(node);
        end = node;
    }

    @Override
    public E get(int index) {
        return getNode(index).getElement();
    }

    @Override
    public E remove(int index) {
        if(index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        E e = getNode(index).getElement();

        if(index == 0){
            head = getNode(index+1);
        } else if(index == size) {
            end = getNode(size-1);
        } else {
            Node<E> nodePrevious = getNode(index-1);
            Node<E> nodeNext = getNode(index+1);

            nodePrevious.setNext(nodeNext);
        }

        size--;

        return e;
    }

    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E[] toArray() {
        Object[] array = new Object[size];

        for (int i=0 ; i<size ; i++) {
            array[i] = get(i);
        }

        return (E[]) array;
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }

    class LinkedList3ilIterator implements Iterator<E> {
        int current = 0;

        public boolean hasNext() {
            return LinkedList3iL.this.getNode(current) != null;
        }

        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return LinkedList3iL.this.get(current++);
        }
    }

    @NotNull
    @Override
    public Iterator<E> iterator() {
        return new LinkedList3ilIterator();
    }
}
