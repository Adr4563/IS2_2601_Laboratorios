/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_02;

/**
 *
 * @author L33218
 */


public class Main {
    public static void main(String[] args) {
        Informe informe = new Informe("Rendimiento trimestral");
        informe.generarInforme();
        
        
        ServicioCorreo sv1 = new ServicioCorreo(informe.getContenido(),"a@aloe.ulima.edu.pe");
        sv1.enviar();
        
        
    }
}