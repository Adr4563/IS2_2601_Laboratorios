/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_02_Ejercicio_03;

/**
 *
 * @author L33218
 */
public abstract class Repartidor {
    private String nombre;

    public Repartidor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void entregarPedido();

    public abstract void recogerPedido();


}
