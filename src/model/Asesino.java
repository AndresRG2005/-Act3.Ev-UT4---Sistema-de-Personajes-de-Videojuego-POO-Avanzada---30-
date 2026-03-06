package model;

public class Asesino extends PersonajeFisico {
    private int sigilo;
    private int critico;

    public Asesino(String nombre, int nivel, int salud, int sigilo, int critico) {
        super(nombre, nivel, salud);
        this.sigilo = sigilo;
        this.critico = critico;
    }

    @Override
    public void atacar(Personaje objetivo) {
        int daño = critico * 3;
        objetivo.setSalud(objetivo.getSalud() - daño);
        System.out.println(nombre + " realiza un ataque critico a " + objetivo.getNombre() + " causando " + daño);
    }
}