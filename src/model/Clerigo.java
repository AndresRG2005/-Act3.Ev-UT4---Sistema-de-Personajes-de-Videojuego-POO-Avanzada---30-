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
}
