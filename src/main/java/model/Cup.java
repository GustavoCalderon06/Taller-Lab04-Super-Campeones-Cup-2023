package model;

import java.util.ArrayList;
import java.util.List;

public class Cup {
    private List<Seleccion> selecciones;

    public Cup() {
        this.selecciones = new ArrayList<>();
    }

    public Seleccion buscarSeleccionPorNombre(String nombre) throws EquipoNoEncontradoException {
        for (Seleccion s:this.selecciones) {
            if(s.getNombre().equals(nombre)) {
                return s;
            }
        }

        throw new EquipoNoEncontradoException();
    }

    public List<Seleccion> getSelecciones() {
        return selecciones;
    }
}
