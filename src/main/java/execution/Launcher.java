package execution;

import data.FileReader;
import guis.VentanaSeleccion;
import model.Cup;

public class Launcher {
    public static void main(String[] args) {
        Cup copa= new Cup();
        FileReader.leerArchivo(copa,"teams.txt");
        new VentanaSeleccion(copa);


    }
}
