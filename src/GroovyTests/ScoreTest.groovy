package GroovyTests

import Cours.Score

class ScoreTest extends GroovyTestCase {
    void testCompareTo() {
        Score scr = new Score("Marcel", 0, 25);
        Score scr2 = new Score("Marcel", 0, 25);

        assert scr.compareTo(scr2) == 0;
    }
}
