/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion.vehiculos;

/**
 *
 * @author imad
 */
public class Cliente {

    private String nif;
    private String nombre;
    private String apellidos;
// se suponen creados los métodos ‘get’ y ‘set’ de la clase
    public Cliente(String nif, String nombre, String apellidos) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

}
