/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, soma = 0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        System.out.println("===========================");
        System.out.println("    SOMADOR DE NÚMEROS     ");
        System.out.println("===========================");
        do {
            System.out.print("DIGITE UM NÚMERO: ");
            num = teclado.nextInt();
            soma += num;
            System.out.print("DESEJA CONTINUAR? [S/N] ");
            resp = teclado.next();
        } while (resp.equals("s"));
        
        System.out.println("===========================");
        System.out.println("A SOMA DE TODOS É " + soma);
        System.out.println("===========================");
        System.out.println("---------------------------");
        
    }
    
}
