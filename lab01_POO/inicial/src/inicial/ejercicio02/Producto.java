/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inicial.ejercicio02;
/**
 *
 * @author user
 */
abstract public class Producto {
    // TODO: Declarar atributos
    protected String nombre;
    protected double precio;
    protected int stock;
    private static int contador;
    protected int id;
    
    public Producto(){
        this.id = 0;
        this.nombre = "";
        this.precio = 0;
        this.stock = 0;
        this.contador = 0;
    }

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        if (precio < 0 || stock < 0){
            throw new IllegalArgumentException("Error en ingresar datos de precio o stock");
        }
        this.precio = precio;
        this.stock = stock;
        contador++;
        this.id = contador; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    public void reducirStock(int cantidad){
        this.stock = this.stock - cantidad;
    }
    

    @Override
    public String toString() {
        return "Producto - NS: "+ id + "\n" +"nombre: " + nombre +"\n" + "precio: " + precio + "\n"+ " stock: " + stock;
    }
    
    


      
    
    public abstract void mostrarInfo();
    
    
}
