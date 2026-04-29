package inicial.ejercicio03;

public class Main {
    public static void main(String[] args) {

        String tema = "Oscuro";

        TemaFactory factory;

        if (tema.equals("Claro")) {
            factory = new TemaClaroFactory();
        } else {
            factory = new TemaOscuroFactory();
        }

        Boton boton = factory.crearBoton();
        Checkbox checkbox = factory.crearCheckbox();

        boton.render();
        checkbox.render();
    }
}