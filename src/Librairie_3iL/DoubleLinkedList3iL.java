package Librairie_3iL;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class DoubleLinkedList3iL<E> implements Iterable<E>, IList<E> {

    private int size;
    private NodeDoubleLinked<E> head;
    private NodeDoubleLinked<E> end;

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public void add(int index, E e) {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E remove(int index) {
        return null;
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
    public E[] toArray() {
        Object[] array = new Object[1];
        return (E[]) array;
    }

    @Override
    public String toString() {
        return new String();
    }

    @NotNull
    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
