package Java_Avance;

import java.util.Arrays;

public class TP_Exception {

    static public void main(String[] arg) {
        Ex9();
    }

    static public void Ex8() {
        final int lower = -5;
        final int higher = 5;

        final int lower02 = 0;
        final int higher02 = 10;

        final int max = 10;
        int tab[] = new int[max];

        for (int i = 0 ; i < max ; i++) {
            tab[i] = (int)(Math.random()*((higher+1)-lower)) + lower;
        }

        try {
            for (int i = 0 ; i < max ; i++) {
                int tmp01 = (int)(Math.random()*((higher02)-lower02)) + lower02;
                int tmp02 = (int)(Math.random()*((higher02)-lower02)) + lower02;

                int div = tab[tmp01]/tab[tmp02];

                System.out.println(tab[tmp01] + " / " + tab[tmp02] + " = " + div);
            }
        }
        catch (ArithmeticException e) {
            System.err.println("Arithmetic error : / by zero");
        }
        catch (IndexOutOfBoundsException e) {
            System.err.println("Index out of bound");
        }
        catch (Exception e) {
            System.err.print("Error : ");
            System.err.println(e.toString());
        }

        System.out.println(Arrays.toString(tab));
    }

    static public void Ex9() {
        final int minTab = -4;
        final int maxTab = 8;

        final int lower02 = 0;
        final int higher02 = 10;

        final int max = 10;
        int tab[] = new int[max];

        for (int i = 0 ; i < max ; i++) {
            tab[i] = (int)(Math.random()*((maxTab+1)-minTab)) + minTab;
        }

        System.out.println(Arrays.toString(tab));

        for (int i = 0 ; i < max ; i++) {
            try {
                int tmp1 = (int) (Math.random() * (higher02 - lower02)) + lower02;
                int tmp2 = (int) (Math.random() * (higher02 - lower02)) + lower02;

                if (tmp2 == 0) {
                    Err.ArithmeticExcept++;
                    throw new Err(
                            "Arithmetic error : " +
                            "\n\ttmp2 == 0 at :" +
                            "\n\t\t'int tmp2 = (int) (Math.random() * ((higher02) - lower02)) + lower02;'");
                }
                if(!(tmp1>0 && tmp1<max) || !(tmp2>0 && tmp2<max)) {
                    Err.IndexOut++;
                    throw new Err("Index out of bounds");
                }

                int div = tab[tmp1] / tab[tmp2];

                System.out.println(tab[tmp1] + " / " + tab[tmp2] + " = " + div);
            }
            catch (Err e) {
                System.err.println(e.msg);
            }
            catch (Exception e) {
                Err.GenericExcept++;
                System.err.println("Error : " + e.toString());
            }
        }

        System.out.println(max-Err.GenericExcept-Err.ArithmeticExcept-Err.IndexOut + " calculs corrects");
        System.out.println(Err.ArithmeticExcept + " division par zero");
        System.out.println(Err.IndexOut + " index hors limite");
        System.out.println(Err.GenericExcept + " générique exception");

        System.out.println("\nMoyenne : ");
    }

}