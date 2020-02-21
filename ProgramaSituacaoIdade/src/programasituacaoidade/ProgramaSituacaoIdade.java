/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programasituacaoidade;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author natal
 */
public class ProgramaSituacaoIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o seu ano de nascimento ");
        int anoNasc = teclado.nextInt();
        
        Calendar cal = GregorianCalendar.getInstance();
	int anoAtual = cal.get(Calendar.YEAR);
        int idade = anoAtual - anoNasc;
        
        System.out.println("Sua idade é " + idade);
        
        if (idade>=18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }
    
}
