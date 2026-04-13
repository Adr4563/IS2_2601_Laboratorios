/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inicial.ejercicio02;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {
        
        /*CASO 1*/
        /*Nombre,Precio,Stock*/
        /*
        Producto p1 = new Producto("Camaron",12.5,20);
        Producto p2 = new Producto("Pez",5.5,14);
        
        p1.mostrarInfo();
        p2.mostrarInfo();
        */
        
        /*CASO 2*/
        /*Peso,Nombre,Precio,Stock*/
        ProductoFisico p1 = new ProductoFisico(3.54,"Camaron",12.5,20);
        ProductoFisico p2 = new ProductoFisico(5.3,"Pez",12.5,20);
        ProductoFisico p3 = new ProductoFisico(2.0,"Calamar",12.5,20);
        /*Correo,Nombre,Precio,Stock*/
        ProductoDigital p4 = new ProductoDigital("a@ulima.edu.pe","Camaron",12.5,20);
        ProductoDigital p5 = new ProductoDigital("b@ulima.edu.pe","Pez",12.5,20);
        ProductoDigital p6 = new ProductoDigital("c@ulima.edu.pe Globo","Calamar",12.5,20);

        
        /*Carrito*/
        
        Carrito c1 = new Carrito();
        
        String respuesta = "";
        int cantidad = 0;
        
        String tipo_producto = "";
        String sel_producto = "";
        
        
        
        Scanner lector = new Scanner(System.in);
        System.out.println("\n ------ Opciones del Carrito ---- ");
        System.out.println("\n A: Ver Catalogo");
        System.out.println("\n B: Agregar Carrito");
        System.out.println("\n C: Finalizar Compra");
        
        
        while(!respuesta.equals("C")){
            System.out.println("\n Seleccionar la opcion: ");  
            respuesta = lector.next();
            /****/ 
            if(respuesta.equals("A")){
                System.out.println(" ---- Catalogo de Productos Fisico o Digital ---- ");
                System.out.println("\n A: Camaron");
                System.out.println("\n B: Pez");
                System.out.println("\n C: Calamar");
                
                
                
            /****/    
            }else if(respuesta.equals("B")){
                System.out.println("\n Agregar produco (A/B/C):  ");
                sel_producto = lector.next();
                
                System.out.println("\n Compra Fisico o Digital:  ");
                tipo_producto = lector.next();
                
                if(tipo_producto.equals("Fisico")){
                    System.out.println("\n Agregar Cantidad del Producto:  ");
                    cantidad = lector.nextInt();
                    switch (sel_producto) {
                        case "A" -> {
                            c1.agregarProducto(p1, cantidad);                       
                        }
                        case "B" -> {
                            c1.agregarProducto(p2, cantidad);                          
                        }
                        case "C" -> {     
                            c1.agregarProducto(p3, cantidad);
                        }
                        default -> {
                        }
                    }
                    System.out.println("\n Desea seguir Agregando compras Si (B) o Finalizar Compras (C): ");
                
                }else if(tipo_producto.equals("Digital")){
                    System.out.println("\n Agregar Cantidad del Producto:  ");
                    cantidad = lector.nextInt();
                    switch (sel_producto) {
                        case "A" -> {
                            c1.agregarProducto(p4, cantidad);                       
                        }
                        case "B" -> {
                            c1.agregarProducto(p5, cantidad);                          
                        }
                        case "C" -> {     
                            c1.agregarProducto(p6, cantidad);
                        }
                        default -> {
                        }
                    }
                    System.out.println("\n Desea seguir Agregando compras Si (B) o Finalizar Compras (C): ");
                    
                }
                
            
            
            
            
            
            
            
            
            
            
            
            /****/ 
            }else if(respuesta.equals("C")){
                respuesta = "C";
                c1.mostrarResumen();
            }
            
            
                
            
            
          
            
            
            
            
            
            
            
            
        }
        
       
        
        
        /*
        System.out.println(p1.toString());
        */
        
        
    }
}
