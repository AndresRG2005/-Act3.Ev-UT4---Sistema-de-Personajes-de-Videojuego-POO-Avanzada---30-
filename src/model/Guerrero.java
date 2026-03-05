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
}