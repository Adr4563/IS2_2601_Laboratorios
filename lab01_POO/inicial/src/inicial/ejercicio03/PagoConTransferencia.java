/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inicial.ejercicio03;

/**
 *
 * @author user
 */
public class PagoConTransferencia extends MetodoPago{
    
    private int codigo;
   

    public PagoConTransferencia(int codigo, double monto) {
        super(monto);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean realizarPago(double monto) {
        
        if (codigo == 12345 ){
            System.out.println("Codigo de confirmacion valido");
            return true;
        }else{
            return false;
        }
                
        
    }
    
    

 
    
    
    

    
}
