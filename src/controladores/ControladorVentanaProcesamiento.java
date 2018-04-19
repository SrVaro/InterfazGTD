/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import vista.VentanaProcesamiento;

/**
 *
 * @author Dell
 */

public class ControladorVentanaProcesamiento {
    private VentanaProcesamiento miVista;

    public ControladorVentanaProcesamiento(VentanaProcesamiento miVista) {
        this.miVista = miVista;
    }

    
    
    public void tarea(){
        
    }
    
    public void ComplejidadYFecha(){
       
        
        if(!miVista.getjComboBoxPrioridad().getSelectedItem().equals("Urgente")){
            miVista.getjPanelComplejidad().setVisible(false);
            miVista.getjPanelFechaFin().setVisible(false);
        }else{
            miVista.getjPanelComplejidad().setVisible(true);
            miVista.getjPanelFechaFin().setVisible(true);
        }
        
        
        

        
    }
    
}
