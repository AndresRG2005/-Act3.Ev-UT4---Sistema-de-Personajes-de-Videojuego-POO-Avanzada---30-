package model;

public abstract class PersonajeFisico extends Personaje {

    public PersonajeFisico(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
    }

    public void golpeBasico(Personaje objetivo) {
        objetivo.setSalud(objetivo.getSalud() - 10);
        System.out.println(nombre + " realiza un golpe básico a " + objetivo.getNombre());
    }
}
