package Cours;

import java.util.LinkedList;

public class SortList<E extends Comparable<E>> extends LinkedList<E>{
    public boolean add(E e) {
        if(size() > 0) {
            int index = 0;

            while (index < size() || e.compareTo(get(index)) < 0) {
                index++;
            }

            add(index -1, e);
        } else {
            super.add(e);
        }

        return true;
    }

}
