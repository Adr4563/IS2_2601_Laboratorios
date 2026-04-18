package inicial.isp;

public class Almacenero implements IGestionInventario {
    private String nombre;

    public Almacenero(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizarInventario(String producto, int cantidad) {
        System.out.println(nombre + " actualizó el stock de " + producto + " en " + cantidad + " unidades.");
    }
}
