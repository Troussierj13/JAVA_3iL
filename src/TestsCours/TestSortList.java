package TestsCours;

import Cours.Score;
import Cours.SortList;

public class TestSortList {
    static public void main(String[] args) {
        SortList<Score> List = new SortList<>();

        List.add(new Score("Georges", 0, 69));
        List.add(new Score("Marcel", 0, 67));
        List.add(new Score("Renee", 0, 155));
        List.add(new Score("Georges", 2, 84));
        List.add(new Score("Lucien", 15, 220));

        for (Score sc : List) {
            System.out.println(sc.ToString());
        }
    }
}
