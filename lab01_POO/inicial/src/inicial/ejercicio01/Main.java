package inicial.ejercicio01;

public class Main {
    public static void main(String[] args) {
        // TODO: Crear productos y mostrar información
        Producto p1 = new Producto("Camaron",12.5,20);
        Producto p2 = new Producto("Pez",5.5,14);
        
        p1.mostrarInfo();
        p2.mostrarInfo();
    }
}
