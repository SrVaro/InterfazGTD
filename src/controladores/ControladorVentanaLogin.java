package controladores;

import java.awt.Color;
import javax.swing.JOptionPane;
import vista.VentanaLogin;

/**
 * Controlador del Login
 * 
 * @author Rafael Yuste Jiménez
 * @version 1.0
 */
public class ControladorVentanaLogin {
    
    private VentanaLogin vistaLogin;
    
    /**
     * Constructor
     * 
     * @param vistaLogin 
     */
    
    public ControladorVentanaLogin(VentanaLogin vistaLogin) {
        this.vistaLogin = vistaLogin;
    }
    
    /**
     * Accede al programa
     */
    
    
    
    public boolean acceder(String nombre, String clave){
        boolean error;
        if(nombre.isEmpty() || clave.isEmpty()){
            error = true;
            
            JOptionPane.showMessageDialog(vistaLogin, "Hay campos sin rellenar.", "ERROR: CAMPOS SIN RELLENAR", JOptionPane.ERROR_MESSAGE);
        }else{
            error = false;
        }
        return error;
    }
    /**
     * Registra a un nuevo usuario y accede al programa
     */
    public void registrarse(String nuevoCorreo, String nuevoNombre, String nuevaClave){ 
        
        // Comprobacion del tamaño de los nuevos correos, nombres y contraseñas
        if(nuevoCorreo.length() < 8 || nuevoCorreo.length() > 12
            || nuevoNombre.length() < 8 || nuevoNombre.length() > 12
            || nuevoNombre.length() < 8 || nuevoNombre.length() > 12){
            
            JOptionPane.showMessageDialog(vistaLogin, "Escribe los campos entre 8 y 12 caractéres.", "ERROR: CAMPOS INCORRECTOS", JOptionPane.ERROR_MESSAGE);
            
            //Cambia el color de fondo de los jTextFields si los campos son incorrectos
            if(nuevoCorreo.length() < 8 || nuevoCorreo.length() > 12){
                vistaLogin.getjTextFieldCorreo().setBackground(Color.RED);
            }       
            if(nuevoNombre.length() < 8 || nuevoNombre.length() > 12){
                vistaLogin.getjTextFieldNuevoUsuario().setBackground(Color.RED);
            }
            if(nuevaClave.length() < 8 || nuevaClave.length() > 12){
                vistaLogin.getjTextFieldNuevaClave().setBackground(Color.RED);
            }
        }else{
            
            //CODIGO....
        }
        
     
    }
}
