package guis;

import model.Cup;
import model.EquipoNoEncontradoException;
import model.Jugador;
import model.Seleccion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class VentanaSeleccion extends Ventana{
    private Cup copa;

    private JButton exit;
    private JButton buscarBtn;
    private JButton verDatos;
    private JComboBox equipo;

    private JLabel ranking;
    private JLabel imagen;

    public VentanaSeleccion(Cup copa) {
        this.copa = copa;

        this.setTitle("Seleccion");

        this.generarEtiqueta("Ranking: ", 20, 100, 80, 20);

        exit = this.generarBoton("Exit", 200, 200, 100, 30);
        exit.addActionListener(this);

        verDatos = this.generarBoton("Ver datos", 20, 200, 150, 30);
        verDatos.addActionListener(this);

        buscarBtn = this.generarBoton("Buscar jugadores", 320, 200, 150, 30);
        buscarBtn.addActionListener(this);

        ranking = this.generarEtiqueta("", 100, 100, 300, 20);

        imagen = this.generarEtiqueta("", 100, 100, 300, 20);

        equipo = this.generarComboBox(copa.getSelecciones(), 20, 50, 200, 20);

    }

    public void mostrarDatosJugadores() throws EquipoNoEncontradoException  {

        Seleccion s = copa.buscarSeleccionPorNombre(equipo.getSelectedItem().toString());
        ranking.setText(Integer.toString(s.getRankingFifa()));
        generarImagen(s.getImagen());
    }

    public void generarImagen(String path) {
        this.imagen= new JLabel(new ImageIcon(path));
        this.imagen.setBounds(250, 50, 70, 46);
        this.imagen.setForeground(Color.BLACK);
        this.imagen.setVisible(true);
        super.add(this.imagen);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == exit) {
            this.dispose();
        } else if(e.getSource() == verDatos) {
            try {
                mostrarDatosJugadores();
            } catch (EquipoNoEncontradoException ex) {
                ex.printStackTrace();
            }
        }
        else if(e.getSource() == buscarBtn) {

        }
    }
}
