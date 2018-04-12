package TestsCours;

import Cours.LecteurFichier;

public class TestLecteurFichier {
    public static void main(String[] arg) {
        LecteurFichier reader = new LecteurFichier("res", "scores.html");

        System.out.println(reader.GetInfoByLine());
    }
}
