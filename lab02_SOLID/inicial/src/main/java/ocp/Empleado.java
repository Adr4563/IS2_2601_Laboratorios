/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_02_Ejercicio_2;

/**
 *
 * @author L33218
 */
public abstract class Empleado {
   protected double salario;
   
   public Empleado(){
       this.salario = 0;
   }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public abstract void calcularSalario(); 
    
    
   
   
    



 /* public double calcularSalario() {
        if (tipoEmpleado.equals("Asalariado")) {
            return 5000;
        } else if (tipoEmpleado.equals("PorHora")) {
            return 20 * 40;
        } else {
            return 0;
        }
    }*/
}