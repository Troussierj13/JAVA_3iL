package Cours;

import org.jetbrains.annotations.NotNull;

public class Cercle implements Comparable {
    public Cercle(int x, int y, double rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }

    public void affiche() {
        System.out.println("Coordonnees : " + x + ", " + y
                + " ; rayon : " + rayon);
    }

    public double getRayon() {
        return rayon;
    }

    public int getX() {
        return x;
    }

    private int x, y;

    double rayon;

    public String ToString() {
        return "x : " + x + " y : " + y + " rayon : " + rayon;
    }

    @Override
    public int compareTo(@NotNull Object o) {
        return 0; //(int)(this.rayon - ((Cercle)o).rayon);
    }
}
