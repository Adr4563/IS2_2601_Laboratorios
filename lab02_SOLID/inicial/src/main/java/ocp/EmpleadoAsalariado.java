/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_02_Ejercicio_2;

/**
 *
 * @author L33218
 */
public class EmpleadoAsalariado extends Empleado {

    private int salarioIngresado;

    public EmpleadoAsalariado(int salarioIngresado) {
        this.salarioIngresado = salarioIngresado;
    }
    
    
    
    @Override
    public void calcularSalario() {
        salario = salarioIngresado;
        System.out.println("Salario del Empleado A Salariado es: "+ salario);
    }
    
    
    
    
}
