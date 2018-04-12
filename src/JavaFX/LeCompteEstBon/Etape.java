package JavaFX.LeCompteEstBon;

import java.util.Arrays;

import java.util.Random;

public class Etape {
    private int[] tabPlaques;
    private int ind1 = 0, ind2 = 0;
    private String[] tabOperation = new String[4];
    private int indOp = 0;
    private int result = 0;

    Etape() {
        tabPlaques = new int[6];

        Random r = new Random();

        for (int i=0 ; i<tabPlaques.length ; i++) {
            tabPlaques[i] = Math.abs(r.nextInt()%200);
        }

        tabOperation[0] = "X";
        tabOperation[1] = "+";
        tabOperation[2] = "-";
        tabOperation[3] = "/";
    }

    Etape(int[] plaque) {
        tabPlaques = plaque;

        tabOperation[0] = "X";
        tabOperation[1] = "+";
        tabOperation[2] = "-";
        tabOperation[3] = "/";
    }

    public void setInd1(int i) {
        if (i < tabPlaques.length) {
            ind1 = i;
        } else {
            throw new IndexOutOfBoundsException("Ind1 is between 0 and " + tabPlaques.length);
        }
    }

    public void setInd2(int i) {
        if (i < tabPlaques.length) {
            ind2 = i;
        } else {
            throw new IndexOutOfBoundsException("Ind2 is between 0 and " + tabPlaques.length);
        }
    }

    public void setIndOp(int i) {
        if (i < tabOperation.length) {
            indOp = i;
        } else {
            throw new IndexOutOfBoundsException("IndOp is between 0 and " + tabOperation.length);
        }
    }

    public int getResult() {
        try {
            if (ind1 != ind2) {
                if (tabOperation[indOp] == "X") {
                    result = tabPlaques[ind1] * tabPlaques[ind2];
                } else if (tabOperation[indOp] == "/") {
                    result = tabPlaques[ind1] / tabPlaques[ind2];
                } else if (tabOperation[indOp] == "+") {
                    result = tabPlaques[ind1] + tabPlaques[ind2];
                } else if (tabOperation[indOp] == "-") {
                    result = tabPlaques[ind1] - tabPlaques[ind2];
                }
            }
        }
        catch(ArithmeticException ar){
            throw new ArithmeticException("Bad operation");
        }

        if (result < 0) {
            result = 0;
            throw new ArithmeticException("Bad operation");
        }

        return result;
    }

    public void setFirstNumber(int number) throws Exception {
        if (Arrays.asList(tabPlaques).contains(number)) {
            setInd1(convertNumberToIndexNumber(number));
            System.out.println(convertNumberToIndexNumber(number));
        } else {
            throw new Exception(number + " : isn't contains on tabPlaques");
        }
    }

    public void setSecondNumber(int number) throws Exception {
        if (Arrays.asList(tabPlaques).contains(number)) {
            setInd2(convertNumberToIndexNumber(number));
            System.out.println(convertNumberToIndexNumber(number));
        } else {
            throw new Exception(number + " : isn't contains on tabPlaques");
        }
    }

    public void setOperand(String operand) throws Exception {
        if (Arrays.asList(tabOperation).contains(operand)) {
            setIndOp(convertStringToIndexOperand(operand));
            System.out.println(convertStringToIndexOperand(operand));
        } else {
            throw new Exception(operand + " : isn't contains on tabOperation");
        }
    }

    public String getStringCalcul() {
        return tabPlaques[ind1] + " " + tabOperation[indOp] + " " + tabPlaques[ind2] + " = " + getResult();
    }

    private int convertStringToIndexOperand(String str) {
        int res = 0;
        for (int i=0 ; i<tabOperation.length ; i++) {
            if(tabOperation[i] == str) {
                res = i;
            }
        }

        return res;
    }

    private int convertNumberToIndexNumber(int number) {
        int res = 0;
        for (int i=0 ; i<tabPlaques.length ; i++) {
            if(tabPlaques[i] == number) {
                res = i;
            }
        }

        return res;
    }
}
