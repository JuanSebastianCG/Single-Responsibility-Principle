/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principioderesponsabilidadunica;

import javax.swing.JOptionPane;

/**
 *
 * @author santi
 */
public class PrincipioDeResponsabilidadUnica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e = new Empleado(JOptionPane.showInputDialog("Ingrese la cedula"), 
            JOptionPane.showInputDialog("Ingrese el nombre"), 
            Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad")), 
            Integer.parseInt(JOptionPane.showInputDialog("Ingrese la sueldo")));
        Hacienda a = new Hacienda("Hacienda1",e);
        System.out.println(a.toString());
        System.out.println(a.calcularImpuesto());
    }
    
}
