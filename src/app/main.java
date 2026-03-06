package app;
import controller.GestorJuego;
import model.*;

public class main {
    public static void main(String[] args) {
        GestorJuego gestor = new GestorJuego();

        Personaje g = new Guerrero("Andres" , 5, 100, 20, 10);
        Personaje a = new Arquero("Aithamy", 4, 90, 15, 18);
        Personaje m = new Mago("Daniel", 6, 80, 50, 25, 10);
        Personaje c = new Clerigo("Claudia", 5, 85, 50, 12, 20);

        juego.agregarPersonaje(g);
        juego.agregarPersonaje(a);
        juego.agregarPersonaje(m);
        juego.agregarPersonaje(c);




        
    }
}
