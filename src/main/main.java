/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import facturador.creacional.FacturaCreator;
import facturador.creacional.GuiaRemisionCreator;
import facturador.creacional.NotaCreditoCreator;
/**
 *
 * @author Harold
 */
public class main {
    private static Scanner reader = new Scanner(System.in);  
    
    public static void main(String[] args) {
        int flag=-1;
        while(flag<0){
            flag=menu();
        }
        reader.close();
    }
    public static int menu(){
        System.out.println("Escoja el comprobante");
        System.out.println("1.Factura");
        System.out.println("2.Guia Remision");
        System.out.println("3.Nota Crédito");
        System.out.println("4.salir");
        System.out.println("");
        
        int eleccion = reader.nextInt(); 
        if(eleccion > 4 | eleccion < 1){
            System.out.println("eleccion incorrecta");
            System.out.println("");
            return -1;
        }
        List<String> productos = new LinkedList<String>();
        productos.add("luz de parqueo");
        productos.add("llanta");
        productos.add("espejo retrovisor");
        double total = 20.0;
        String nombre = "Juanito Alcachofa";
        String destino = "quito";
        String placa = "ABCD-0001";
        long codigo = 123456789;
        String detalle = "cambios por que si";
        LocalDate fecha = LocalDate.now();
        if(eleccion == 1){
            FacturaCreator fact = new FacturaCreator();
            System.out.println(fact.factoryMethod(productos, total, nombre, codigo, fecha));
            System.out.println("");
        
        }
        else if(eleccion == 2){
            GuiaRemisionCreator fact = new GuiaRemisionCreator();
            System.out.println(fact.factoryMethod(destino,placa,productos, nombre, codigo, fecha));
            System.out.println("");
        }
        else if(eleccion == 3){
            NotaCreditoCreator fact = new NotaCreditoCreator();
            System.out.println(fact.factoryMethod(detalle,total, nombre, codigo, fecha));
            System.out.println("");
        }
        else if(eleccion == 4){
            System.out.println("Hasta la pró4"
                    + "xima");
            return 0;
        }
        
        return -1;
        
    }
}
