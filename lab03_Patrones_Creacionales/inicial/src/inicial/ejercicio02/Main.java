package inicial.ejercicio02;

public class Main {
    public static void main(String[] args) {

        CreadorComprobante creador;

        String tipo = "factura";

        if (tipo.equalsIgnoreCase("boleta")) {
            creador = new CreadorBoleta();
        } else {
            creador = new CreadorFactura();
        }

        creador.procesar("Farfan 12934", 20120034.0);
    }
}