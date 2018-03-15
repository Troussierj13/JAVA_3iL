package TestsCours;

import Cours.Score;

import java.util.Collections;
import java.util.LinkedList;

public class TestScore {

    static public void main(String[] arg) {
        LinkedList<Score> List = new LinkedList<>();
        List.add(new Score("Georges", 0, 69));
        List.add(new Score("Marcel", 0, 67));
        List.add(new Score("Renee", 0, 155));
        List.add(new Score("Georges", 2, 84));
        List.add(new Score("Lucien", 15, 220));

        Collections.sort(List);

        for (Score sc : List) {
            System.out.println(sc.ToString());
        }
    }
}
