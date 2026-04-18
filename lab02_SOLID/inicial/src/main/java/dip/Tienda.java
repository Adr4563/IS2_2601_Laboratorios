


public class Tienda {

    private Proveedor proveedor;

    // Inyección por constructor
    public Tienda(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public void reabastecer(String producto, int cantidad) {
        proveedor.abastecerProducto(producto, cantidad);
    }
}