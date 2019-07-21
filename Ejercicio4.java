/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float euro;
       float quetzal = 8.62f;
       float conversion;
       
        System.out.println("Escriba la cantidad de euros que quiere convertir en quetzal: ");
        Scanner sc = new Scanner(System.in);
        euro = sc.nextFloat();
       
        conversion = euro * quetzal;
        
        System.out.println("Los euros que ha convertido a quetzal son: "+conversion);
    }
    
}
