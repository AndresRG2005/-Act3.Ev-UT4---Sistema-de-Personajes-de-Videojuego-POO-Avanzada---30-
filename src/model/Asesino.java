package model;

public class Asesino extends PersonajeFisico {
    private int sigilo;
    private int critico;

    public Asesino(String nombre, int nivel, int salud, int sigilo, int critico) {
        super(nombre, nivel, salud);
        this.sigilo = sigilo;
        this.critico = critico;
    }
}