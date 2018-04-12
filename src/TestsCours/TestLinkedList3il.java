package TestsCours;

import Librairie_3iL.LinkedList3iL;

public class TestLinkedList3il {
    public static void main(String[] arg) {
        LinkedList3iL<Integer> list = new LinkedList3iL();

        boolean empt = list.isEmpty();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(1, 3);
        list.add(1,4);

        System.out.println(list.toString());
    }
}
