/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura.datos.modelo;

/**
 *
 * @author Boris Perez
 */
public class RegistroNegocio {

    private String nombre, apellido;
    private int edad;

    public boolean registrarPersona(String nombre, String apellido, String edad) {

        int edad1 = Integer.parseInt(edad);
        if (edad1 > 17) {
            this.edad = edad1;
            this.nombre = nombre;
            this.apellido = apellido;
            return true;
        }
        return false;
    }

}
