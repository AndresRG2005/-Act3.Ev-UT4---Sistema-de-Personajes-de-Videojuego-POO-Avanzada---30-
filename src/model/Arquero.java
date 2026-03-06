import model.interfaces.Movible;

public class Arquero extends PersonajeFisico implements Movible {

    private int agilidad;
    private int precision;

    public Arquero(String nombre, int nivel, int salud, int agilidad, int precision) {
        super(nombre, nivel, salud);
        this.agilidad = agilidad;
        this.precision = precision;
    }

    @Override
    public void atacar(Personaje objetivo) {
        int daño = precision + 5;
        objetivo.setSalud(objetivo.getSalud() - daño);
        System.out.println(nombre + " dispara una flecha a " + objetivo.getNombre() + " causando " + daño);
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " se mueve rápidamente entre los árboles.");
    }
}
