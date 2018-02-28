package Java_Avance;

public class Err extends RuntimeException{
    static public int ArithmeticExcept = 0;
    static public int IndexOut = 0;
    static public int GenericExcept = 0;

    String msg;

    public Err(String str){
        msg = str;
    }
}
