/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author natal
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s=0, c=0, p=0, i=0, a=0;
        float media;
        do{    
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: (valor 0 interrompe)"));
            s+=n;
            c++;
            if (n%2==0){
                p++;
            }else{
                i++;
            }
            
            if (n>100){
                a++;
            } 
            
        }while (n!=0);
        media = (float) s/c;
        JOptionPane.showMessageDialog(null, "<html>Resultado final<br><hr>"
                                            + "Somatório vale: "+s
                                            +"<br>Valores inseridos: "+c
                                            +"<br>Valores pares: "+p
                                            +"<br>Valores ímpares: "+i
                                            +"<br>Valores acima de 100: "+a
                                            +"<br>Média dos valores: "+media+"</html>");
        
    }
    
}
