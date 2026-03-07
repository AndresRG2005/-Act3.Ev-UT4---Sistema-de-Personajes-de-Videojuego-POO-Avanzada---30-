package model;

import java.util.Objects;
import java.util.UUID;

public abstract class Personaje {
    protected String id;
    protected String nombre;
    protected int nivel;
    protected int salud;

    public Personaje(String nombre, int nivel, int salud) {
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    public abstract void atacar(Personaje objetivo);

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public int getNivel() { return nivel; }
    public int getSalud() { return salud; }

    public void setSalud(int salud) { this.salud = salud; }

    @Override
    public String toString() {
        return nombre + " (Nivel " + nivel + ", Salud " + salud + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personaje)) return false;
        Personaje p = (Personaje) o;
        return Objects.equals(id, p.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
