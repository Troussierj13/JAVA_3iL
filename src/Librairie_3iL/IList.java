package Librairie_3iL;

public interface IList<E>{
    boolean add(E e);
    void add(int index, E e);
    E get(int index);
    E remove(int index);
    boolean isEmpty();
    int size();
    E[] toArray();
}
