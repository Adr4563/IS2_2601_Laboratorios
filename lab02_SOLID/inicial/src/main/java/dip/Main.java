
public class Main {
    public static void main(String[] args) {

        Proveedor proveedor = new ProveedorLocal();
        Tienda tienda = new Tienda(proveedor);

        tienda.reabastecer("Arroz", 50);
    }
}