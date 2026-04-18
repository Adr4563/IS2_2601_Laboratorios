/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_02_Ejercicio_2;

/**
 *
 * @author L33218
 */
public class EmpleadoPorHora extends Empleado{
    
    private int hora;
    private int soles;

    public EmpleadoPorHora(int hora, int soles) {
        this.hora = hora;
        this.soles = soles;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getSoles() {
        return soles;
    }

    public void setSoles(int soles) {
        this.soles = soles;
    }

    @Override
    public void calcularSalario() {
        salario = hora * soles;
        System.out.println("Salario Total del Empleado Por hora es: " + salario);
    }
    
    
    
}
