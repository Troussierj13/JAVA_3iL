package Librairie_perso;

public class CoupleNomme<T> extends Couple<T>{

    private String name;

    public CoupleNomme(T premier, T second, String _name) {
        super(premier, second);
        this.name = _name;
    }

    public void affiche(){
        System.out.print("Name : " + name + " - ");
        super.affiche();
    }
}
