/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inicial.ejercicio03;

/**
 *
 * @author user
 */
public class PagoConTarjeta extends MetodoPago {
    
    private String numTarjeta;

    public PagoConTarjeta(String numTarjeta, double monto) {
        super(monto);
        if(numTarjeta.length()==16){
            this.numTarjeta = numTarjeta;
        }else{
            System.out.println("No se ha registrado el numero de la tarjeta. Debe conter 16 digitos");
        }
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    @Override
    public boolean realizarPago(double monto) {
        if (numTarjeta.length()>0){
            System.out.println("Se Realizo el Pago cuyo monto es "+monto);
            return true;
        }else{
            System.out.println("No se Realizo el Pago");
            return false;
        }
    }

    
    
    
     
    
}
