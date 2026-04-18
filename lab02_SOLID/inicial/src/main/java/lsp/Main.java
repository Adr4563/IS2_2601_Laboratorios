/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_02_Ejercicio_03;

/**
 *
 * @author L33218
 */
public class Main {
    
    
    public static void main(String[] args) {
        Repartidor repartidorMoto = new RepartidorMoto("Carlos");
        Repartidor repartidorBici = new RepartidorBicicleta("Lucía");

        repartidorMoto.recogerPedido();
        repartidorMoto.entregarPedido();

        System.out.println();

        repartidorBici.recogerPedido();
        repartidorBici.entregarPedido();

    }

    
}
