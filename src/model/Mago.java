package model;
import model.interfaces.Curable;

public class Mago extends PersonajeMagico implements Curable {
    private int poderMagico;
    private int sabiduria;
    public Mago(String nombre, int nivel, int salud, int poderMagico, int sabiduria, int mana) {
        super(nombre, nivel, salud, mana);
        this.poderMagico = poderMagico;
        this.sabiduria = sabiduria;

        @Override
        public void atacar(Personaje objetivo) {
            int daño = poderMagico * 2;
            objetivo.setSalud(objetivo.getSalud() - daño);
            System.out.println(nombre + " lanza un hechizo a " + objetivo.getNombre() + " causando " + daño);
        }    
        
        @Override
        public void curar(Personaje objetivo) {
            objetivo.setSalud(objetivo.getSalud() + sabiduria);
            System.out.println(nombre + " cura a " + objetivo.getNombre());
        }
}
