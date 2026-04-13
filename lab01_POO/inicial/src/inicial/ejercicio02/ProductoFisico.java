/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inicial.ejercicio02;

/**
 *
 * @author user
 */
public class ProductoFisico extends Producto {
    
    private double peso;

    public ProductoFisico(double peso, String nombre, double precio, int stock) {
        super(nombre, precio, stock);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Producto Fisico: "+ id + 
                "\n" +"nombre: " + nombre + 
                "\n" + "precio: " + precio + 
                "\n"+ "stock: " + stock + 
                "\n" + "peso: "+ peso);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "peso: "+ peso;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
