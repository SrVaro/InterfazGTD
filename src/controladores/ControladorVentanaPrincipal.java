/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

//import administradorDeTareas.TareaEntrada;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author SrKil
 */
public class ControladorVentanaPrincipal {

    private int y = 10;

    public JPanel crearPanelTareaEntrada(String nombreTarea) {

        long milisegundos = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM,yyyy HH:mm");
        Date fechaActual = new Date(milisegundos);
        System.out.println(sdf.format(fechaActual));

        //TareaEntrada nuevaTarea = new TareaEntrada(nombreTarea, fechaActual);

        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.setBounds(10, y, 800, 50);
        panel.setLayout(null);
        {
            JLabel lblNombreTarea = new JLabel(nombreTarea);
            lblNombreTarea.setBounds(10, 11, 223, 14);
            panel.add(lblNombreTarea);
        }
        {
            JLabel lblFechaInicio = new JLabel("Fecha Inicio");
            lblFechaInicio.setBounds(301, 25, 103, 14);
            panel.add(lblFechaInicio);
        }

        this.y += 55;

        return panel;

    }

}
