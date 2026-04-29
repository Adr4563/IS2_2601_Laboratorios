package inicial.ejercicio03;

public class TemaOscuroFactory implements TemaFactory {

    public Boton crearBoton() {
        return new BotonOscuro();
    }

    public Checkbox crearCheckbox() {
        return new CheckboxOscuro();
    }
}