java
package model;

import model.interfaces.Defendible;

public class Guerrero extends PersonajeFisico implements Defendible {

    private int fuerza;
    private int armadura;

        public Guerrero(String nombre, int nivel, int salud, int fuerza, int armadura) {
        super(nombre, nivel, salud);
        this.fuerza = fuerza;
        this.armadura = armadura;
    }

       @Override
    public void atacar(Personaje objetivo) {
        int daño = fuerza * 2;
        objetivo.setSalud(objetivo.getSalud() - daño);
        System.out.println(nombre + " ataca con espada a " + objetivo.getNombre() + " causando " + daño);
    }

}