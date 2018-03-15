package Cours;

import org.jetbrains.annotations.NotNull;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Score implements Comparable<Score> {

    String name, date;
    Integer score;
    Integer timer;

    public Score(String name,int score, int timer) {
        this.name = name;
        this.score = score;
        this.timer = timer;
        this.date = new SimpleDateFormat("dd/MM/yyyy", Locale.FRANCE).format(new Date());
    }

    public String ToString() {
        return name + " = " + score + " en " + String.format("%02d:%02d", timer/60, timer%60) + "\t\t(le " + date + ")";
    }

    @Override
    public int compareTo(@NotNull Score o) {
        // == : 0 ; < : <0 ; > : >0
        int res = score.compareTo(o.score);
        if(res == 0) {
           res = timer.compareTo(o.timer);
        }
        return res;
    }
}
