
public class ProveedorLocal implements Proveedor {

    @Override
    public void abastecerProducto(String producto, int cantidad) {
        System.out.println("Proveedor local abasteció " + cantidad + " unidades de " + producto);
    }
}