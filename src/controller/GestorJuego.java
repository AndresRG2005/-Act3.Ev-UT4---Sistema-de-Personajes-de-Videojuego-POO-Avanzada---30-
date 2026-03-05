package controller;

import java.util.ArrayList;
import model.Personaje;
import model.interfaces.Curable;

public class GestorJuego {

    private ArrayList<Personaje> personajes = new ArrayList<>();

    public void agregarPersonaje(Personaje p) {
        personajes.add(p);
    }

    public void listarPersonajes() {
        personajes.forEach(System.out::println);
    }
}
