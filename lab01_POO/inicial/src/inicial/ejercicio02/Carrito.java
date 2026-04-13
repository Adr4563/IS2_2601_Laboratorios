/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inicial.ejercicio02;

import java.util.ArrayList;



/**
 *
 * @author user
 */
public class Carrito {

    private ArrayList<Producto> productos = new ArrayList<>();
    
    public void agregarProducto(Producto producto, int cantidad) {

        if (cantidad < producto.getStock() ) {
            productos.add(producto);
            producto.reducirStock(cantidad);
            System.out.println("Producto agregado al carrito");
        } else if(cantidad > producto.getStock()){
            System.out.println("No hay stock disponible");
        }
        

    }
    
    public void mostrarResumen() {

        double monto = 0;

        System.out.println("\n Informacion del carrito");

        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            p.mostrarInfo();
            monto += p.getPrecio();
        }

        System.out.println("Total a pagar: S/ " + monto);
    } 

    
}
