package inicial.ejercicio03;

public class TemaClaroFactory implements TemaFactory {

    public Boton crearBoton() {
        return new BotonClaro();
    }

    public Checkbox crearCheckbox() {
        return new CheckboxClaro();
    }
}