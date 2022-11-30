package data;

import model.Cup;
import model.Jugador;
import model.PosicionJugador;
import model.Seleccion;

import java.io.BufferedReader;
import java.io.File;

public class FileReader {
    public static Cup leerArchivo(Cup copa, String direccionArchivo) {
        String textoArchivo = "";
        try {
            File archivo = new File(direccionArchivo);
            java.io.FileReader fr = new java.io.FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            //Lee cada linea del archivo hasta que la linea sea nula
            while ((textoArchivo = br.readLine()) != null) {
                String[] data = textoArchivo.split(";");
                copa.getSelecciones().add(new Seleccion(data[0],Integer.parseInt(data[1]),data[2]));
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Documento no disponible, favor contactar con administrador");
        }
        return copa;
    }
}

