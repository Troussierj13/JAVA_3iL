package JavaFX.Calculatrice;

public class Heure {

    public int h, m, s;

    Heure(String str) {
        String[] heure = str.split(":");

        if(heure.length != 3 || Integer.valueOf(heure[0]) > 24 || Integer.valueOf(heure[1]) > 60 || Integer.valueOf(heure[2]) > 60) {
            throw new IllegalArgumentException();
        }

        for(String s : heure) {
            if(Integer.valueOf(s) < 0) {
                throw new IllegalArgumentException();
            }
        }

        h = Integer.valueOf(heure[0]);
        m = Integer.valueOf(heure[1]);
        s = Integer.valueOf(heure[2]);
    }

    public Heure moins(Heure _heure) {
        return new Heure((h-_heure.h) + ":" + (m-_heure.m) + " " + (s-_heure.s) + " ");
    }

    public Heure plus(Heure _heure) {
        return new Heure((h+_heure.h) + ":" + (m+_heure.m) + " " + (s+_heure.s) + " ");
    }

    @Override
    public String toString() {
        return new String(h + ":" + m + ":" + s);
    }
}
