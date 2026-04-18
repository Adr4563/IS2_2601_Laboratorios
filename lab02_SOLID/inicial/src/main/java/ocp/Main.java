/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_02_Ejercicio_2;

/**
 *
 * @author L33218
 */
public class Main {
    public static void main(String[] args) {
        EmpleadoAsalariado empAS = new EmpleadoAsalariado(500);
        EmpleadoPorHora empPH = new EmpleadoPorHora(20,50);
        
        empAS.calcularSalario();
        empPH.calcularSalario();
        
        

    }
}