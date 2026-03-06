# -Act3.Ev-UT4---Sistema-de-Personajes-de-Videojuego-POO-Avanzada---30-

README.md

# Sistema de Personajes de Videojuego (Proyecto UT4)

Proyecto realizado para la actividad de evaluación de POO avanzada.  
El objetivo es crear un sistema de personajes usando herencia, polimorfismo, clases abstractas, interfaces y colecciones.



## Contenido del proyecto

El proyecto incluye:

- Una clase abstracta base `Personaje`.
- Dos clases abstractas intermedias:
  - `PersonajeFisico`
  - `PersonajeMagico`
- Seis clases concretas:
  - `Guerrero`
  - `Arquero`
  - `Asesino`
  - `Mago`
  - `Hechicero`
  - `Clerigo`
- Tres interfaces:
  - `Curable`
  - `Defendible`
  - `Movible`
- Una clase gestora del juego: `GestorJuego`
- Un `Main` que crea personajes y ejecuta acciones.



## Estructura del proyecto


src/
├── app/Main.java
├── controller/GestorJuego.java
└── model/
├── Personaje.java
├── PersonajeFisico.java
├── PersonajeMagico.java
├── Guerrero.java
├── Arquero.java
├── Asesino.java
├── Mago.java
├── Hechicero.java
├── Clerigo.java
└── interfaces/
├── Curable.java
├── Defendible.java
└── Movible.java



## Cómo ejecutar

1. Abrir el proyecto en Visual Studio Code o IntelliJ.
2. Compilar el proyecto.
3. Ejecutar `Main.java`.
4. Se mostrarán:
   - Los personajes creados.
   - Ataques polimórficos.
   - Uso de interfaces (curar, defender, moverse).


## Reparto de tareas

### Andrés
- Clase `Guerrero`
- Interfaz `Defendible`
- Clase `Personaje`
- Parte del `GestorJuego`

### Daniel
- Clase `Mago`
- Interfaz `Curable`
- Clase `PersonajeMagico`
- Parte del `Main`

### Aithamy
- Clase `Arquero`
- Interfaz `Movible`
- Clase `PersonajeFisico`
- Parte del `GestorJuego`

### Claudia
- Clase `Clérigo`
- Revisión de interfaces
- Pruebas en `Main`

## Diagrama simple


Personaje
├── PersonajeFisico
│     ├── Guerrero
│     ├── Arquero
│     └── Asesino
└── PersonajeMagico
├── Mago
├── Hechicero
└── Clerigo




## Notas

Este proyecto cumple los requisitos mínimos de la actividad:  
- Herencia  
- Polimorfismo  
- Clases abstractas  
- Interfaces  
- Colecciones  
- Uso de instanceof  
- Organización en paquetes
