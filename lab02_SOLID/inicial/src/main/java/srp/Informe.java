/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_02;

/**
 *
 * @author L33218
 */

public class Informe {
    private String contenido;
    
    public Informe(){
        this.contenido = "CONTENIDO ORIGINAL";
    }

    public Informe(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    

    public void generarInforme(){
        System.out.println("Informe generado: " + contenido);
    }


}