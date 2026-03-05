java
package model;

public class Hechicero extends PersonajeMagico {

    private int oscuridad;
    private int invocacion;

    public Hechicero(String nombre, int nivel, int salud, int mana, int oscuridad, int invocacion) {
        super(nombre, nivel, salud, mana);
        this.oscuridad = oscuridad;
        this.invocacion = invocacion;
    }

}


