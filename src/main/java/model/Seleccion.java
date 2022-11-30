package model;

import java.util.ArrayList;
import java.util.List;

public class Seleccion {
    private String nombre;
    private int rankingFifa;
    private String imagen;
    private List<Jugador> jugadores;


    public Seleccion() {
        this.jugadores = new ArrayList<>();
    }

    public Seleccion(String nombre, int rankingFifa,String imagen) {
        this.nombre = nombre;
        this.rankingFifa = rankingFifa;
        this.imagen=imagen;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public int getRankingFifa() {
        return rankingFifa;
    }

    public String getImagen() {
        return imagen;
    }

    public String toString() {
        return (this.nombre + ";" + this.rankingFifa + ";" + this.imagen);
    }



}
