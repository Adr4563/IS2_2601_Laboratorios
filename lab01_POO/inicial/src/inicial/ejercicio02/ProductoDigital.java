/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inicial.ejercicio02;
/**
 *
 * @author user
 */
public class ProductoDigital extends Producto{
    
    private String urlDescarga;

    public ProductoDigital(String urlDescarga, String nombre, double precio, int stock) {
        super(nombre, precio, stock);
        this.urlDescarga = urlDescarga;
    }

    public String getUrlDescarga() {
        return urlDescarga;
    }

    public void setUrlDescarga(String urlDescarga) {
        this.urlDescarga = urlDescarga;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n" + "urlDescarga: "+ urlDescarga;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Producto Digital: "+ id + "\n" +"nombre: " + nombre +"\n" + "precio: " + precio + "\n"+ " stock: " + stock + "\n" + urlDescarga);
    }

    
    
    
    
        
    
}
