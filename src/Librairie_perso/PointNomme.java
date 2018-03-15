package Librairie_perso;

public class PointNomme extends Couple<Integer>{

    private String name;

    public PointNomme(Integer premier, Integer second, String _name) {
        super(premier, second);
        this.name = _name;
    }

    @Override
    public void affiche() {
        System.out.print("Name : " + name + " - ");
        super.affiche();
    }
}
