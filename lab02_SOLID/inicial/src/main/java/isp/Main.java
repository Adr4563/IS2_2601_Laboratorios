package inicial.isp;

public class Main {
    public static void main(String[] args) {
        Cajero cajero = new Cajero("Ana");
        Almacenero almacenero = new Almacenero("Luis");
        Supervisor supervisor = new Supervisor("Marta");

        cajero.registrarVenta("Mouse inalámbrico", 45.0);
        almacenero.actualizarInventario("Mouse inalámbrico", 10);

        System.out.println();

        almacenero.actualizarInventario("Teclado mecánico", 20);
        supervisor.supervisarOperacion();

        System.out.println();

        supervisor.supervisarOperacion();
        cajero.registrarVenta("Laptop", 3200.0);
    }
}
