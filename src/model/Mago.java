package model;
import model.interfaces.Curable;

public class Mago extends PersonajeMagico implements Curable {
    private int poderMagico;
    private int sabiduria;
    public Mago(String nombre, int nivel, int salud, int poderMagico, int sabiduria, int mana) {
        super(nombre, nivel, salud, mana);
        this.poderMagico = poderMagico;
        this.sabiduria = sabiduria;
    }       
}
