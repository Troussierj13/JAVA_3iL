package Java_Avance;
import Collection.CoupleNomme;
import Collection.PointNomme;

public class TP_Generique {
    static public void main(String[] arg) {

    }

    static <T> T hasard(T [] array) {
        if(array.length<1) {
            throw new RuntimeException("'array' is empty");
        } else if(array == null) {
            throw new RuntimeException("'array' is null reference");
        }

        T i = array[(int)(Math.random()*100.0) %array.length];

        return i;
    }

    static <T extends Comparable<T>> T max(T[] valeurs) {
        T val = valeurs[0];

        for(int i=1 ; i<valeurs.length ; i++) {
            if(val.compareTo(valeurs[i]) > 0) {
                val = valeurs[0];
            }
        }

        return val;
    }

}
