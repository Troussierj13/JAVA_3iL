package TestsCours;

import Cours.Cercle;

import java.util.*;


public class TestCercle {

    public static void main(String args[]) {

        TreeMap<Double, Cercle> map = new TreeMap<Double, Cercle>();
        map.put(10.0, new Cercle(0, 0, 10));
        map.put(5.0, new Cercle(0, 0, 5));
        map.put(1.0, new Cercle(0, 0, 1));
        map.put(15.0, new Cercle(0, 0, 15));
        map.put(109.0, new Cercle(0, 0, 109));
    }

    static <T> T hasard(T [] array) {
        if(array.length<1) {
            throw new RuntimeException("'array' is empty");
        } else if(array == null) {
            throw new RuntimeException("'array' is null reference");
        }

        T i = array[(int)(Math.random()*100.0*array.length) %array.length];

        return i;
    }

    static <T extends Comparable<T>> T max(T[] valeurs) {
        T val = valeurs[0];

        for(int i=1 ; i<valeurs.length ; i++) {
            if(val.compareTo(valeurs[i]) < 0) {
                val = valeurs[i];
            }
        }

        return val;
    }
}



