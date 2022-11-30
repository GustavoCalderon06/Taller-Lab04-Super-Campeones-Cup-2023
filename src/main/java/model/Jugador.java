package model;

public class Jugador {
    private String nombre;
    private String numero;
    private PosicionJugador posicion;

    public Jugador(String numero, String nombre, PosicionJugador posicion) {
        this.numero = numero;
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public PosicionJugador getPosicion() {
        return posicion;
    }

    public void setPosicion(PosicionJugador posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return (this.numero + ";" + this.nombre + ";" + this.posicion);
    }
}
