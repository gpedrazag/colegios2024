/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.unipiloto.algoritmia.chequera;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ChequeraMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner scan =new Scanner(System.in);
               
        System.out.println("Escriba un texto ");
        String cadena=scan.nextLine();
        
        
        System.out.println("Escriba un numero ");
        int valor= scan.nextInt();
        
        System.out.println("Digito un valor de "+valor);
        System.out.println("Escribo el texto "+cadena);
                
    }
    
}
