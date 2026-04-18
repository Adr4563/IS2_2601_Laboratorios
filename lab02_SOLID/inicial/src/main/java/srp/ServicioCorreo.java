/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_02;

/**
 *
 * @author L33218
 */
public class ServicioCorreo {
    
    private String informe;
    private String correo;

    public ServicioCorreo(String informe, String correo) {
        this.informe = informe;
        this.correo = correo;
    }

    public String getInforme() {
        return informe;
    }

    public void setInforme(String informe) {
        this.informe = informe;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void enviar(){
        
        System.out.println("Informe enviado: "+informe + " con el correo: " + correo);
        
        
    }
    
    
    
}
