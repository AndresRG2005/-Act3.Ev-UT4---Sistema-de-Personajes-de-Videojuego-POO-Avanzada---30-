package model;

public abstract class PersonajeMagico extends Personaje {
    protected int mana;

    public PersonajeMagico(String nombre, int nivel, int salud, int mana) {
        super(nombre, nivel, salud);
        this.mana = mana;
    }
}