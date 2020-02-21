/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosoma;

import java.util.Scanner;

/**
 *
 * @author natal
 */
public class NumeroSoma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s=0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.print("Digite um número: ");
            n = teclado.nextInt();
            s+=n;
            System.out.print("Continuar?(S/N) ");
            resp = teclado.next();
        }while (resp.equals("S"));
        System.out.println("A soma deu "+s);
        
    }
    
}
