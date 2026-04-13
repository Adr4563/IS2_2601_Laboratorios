/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inicial.ejercicio03;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        String respuesta = "";
        String tarjeta = "";
        int monto = 0;
        System.out.println("Seleccionar el metodo de pago"
                +"\n"+"Tarjeta"
                +"\n"+"Transferencia"
                +"\n"+"Respuesta: ");
        respuesta = lector.next();
        
        if(respuesta.equals("Tarjeta")){
            System.out.println("Ingresar numero de la tarjeta 16 digitos: ");
            tarjeta = lector.next();
            System.out.println("Ingresar monto: ");
            monto = lector.nextInt();  
            
            PagoConTarjeta pago_c1 = new PagoConTarjeta(tarjeta,monto);
            pago_c1.realizarPago(149);
            
        }else if(respuesta.equals("Transferencia")){
            System.out.println("Ingresar numero de la tarjeta 16 digitos: ");
            tarjeta = lector.next();
            System.out.println("Ingresar monto: ");
            monto = lector.nextInt();    
            
            PagoConTarjeta pago_c1 = new PagoConTarjeta(tarjeta,monto);
            pago_c1.realizarPago(100);
            
        }else{
            System.out.println("Metodo no valido");
        }
        
        
        
        

        
        
        
    }
}
