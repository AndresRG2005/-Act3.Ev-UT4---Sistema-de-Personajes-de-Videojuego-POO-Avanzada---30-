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

    public void simularTurno() {
        for (Personaje p : personajes) {
            for (Personaje objetivo : personajes) {
                if (!p.equals(objetivo)) {
                    p.atacar(objetivo);

                    if (p instanceof Curable) {
                        ((Curable) p).curar(objetivo);
                    }
                }
            }
        }
    }
}
