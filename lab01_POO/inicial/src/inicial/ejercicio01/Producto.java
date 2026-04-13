package inicial.ejercicio01;


public class Producto {
    // TODO: Declarar atributos
    private String nombre;
    private double precio;
    private int stock;
    private static int contador;
    private int id;
    
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
        this.id = this.id +contador; 
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
    
    
    public void mostrarInfo() {
        System.out.println("Monstrar Informacion del producto "+id
                +"\n"+"Nombre: "+ nombre+"\n"+
                "Precio: "+precio+"\n"+
                "Stock: "+stock);
    }
 
    
    
    
}
