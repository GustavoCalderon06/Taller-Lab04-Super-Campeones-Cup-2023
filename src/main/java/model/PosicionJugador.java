package model;

public enum PosicionJugador {
    GK("GK"),DF("DF"),MF("MC"),FW("FW");

    private String posicionJugador;

    PosicionJugador(String posicionJugador) {
        this.posicionJugador = posicionJugador;

    }

    public String getPosicionJugador() {
        return posicionJugador;
    }

    @Override
    public String toString() {
        return (posicionJugador);
    }
}
