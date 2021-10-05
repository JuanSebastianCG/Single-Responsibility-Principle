/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principioderesponsabilidadunica;

/**
 *
 * @author santi
 */
public class Empleado {
    
    String cedula;
    String nombre;
    int edad;
    double sueldo;

    public Empleado() {
    }

    public Empleado(String cedula, String nombre, int edad, double sueldo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "cedula: "+cedula+", nombre: "+nombre+", edad: "+edad+", sueldo: "+sueldo;
    }
    
    
}
