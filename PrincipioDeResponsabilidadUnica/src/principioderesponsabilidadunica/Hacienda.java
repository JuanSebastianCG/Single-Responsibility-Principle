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
public class Hacienda {
    String nombre;
    Empleado e;

    public Hacienda() {
    }

    public Hacienda(String nombre, Empleado e) {
        this.nombre = nombre;
        this.e = e;
    }

    @Override
    public String toString() {
        return "nombre de la hacienda: "+nombre+e.toString();
    }
    
    
    
 public double calcularImpuesto(){
     double impuesto = e.sueldo *0.3;
     return impuesto;
}  
 public void pagarImpuesto(){
     
 }   
}
