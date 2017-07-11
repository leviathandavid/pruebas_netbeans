
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Main {
    
    public static void main(String[]a){
        String nombre = "";
        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre:");
        JOptionPane.showMessageDialog(null, "Hola " + nombre);
    }
    
}
