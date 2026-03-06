package model;

import model.interfaces.Curable;

public class Clerigo extends PersonajeMagico implements Curable {
    private int fe;
    private int proteccion;

    public Clerigo(String nombre, int nivel, int salud, int mana, int fe, int proteccion) {
        super(nombre, nivel, salud, mana);
        this.fe = fe;
        this.proteccion = proteccion;
    }

    @Override
    public void atacar(Personaje objetivo) {
        int daño = fe;
        objetivo.setSalud(objetivo.getSalud() - daño);
        System.out.println(nombre + "golpea con luz divina a " + objetivo.getNombre() + " causando " + daño);
    }

    @Override
    public void curar(Personaje objetivo) {
        objetivo.setSalud(objetivo.getSalud() + proteccion);
        System.out.println(nombre + "cura con energía sagrada a " + objetivo.getNombre());
    }
}
