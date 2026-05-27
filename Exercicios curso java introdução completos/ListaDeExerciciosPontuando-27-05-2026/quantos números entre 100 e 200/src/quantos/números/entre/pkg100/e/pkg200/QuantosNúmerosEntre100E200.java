/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quantos.números.entre.pkg100.e.pkg200;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class QuantosNúmerosEntre100E200 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contEntre = 0;
        int entrada = -1;
        while (entrada != 0) {
            System.out.print("Digite um número (0 para parar): ");
            entrada = sc.nextInt();
            if (entrada >= 100 && entrada <= 200) {
                contEntre++;
            }
        }
     System.out.println("Quantidade de números entre 100 e 200: " + contEntre+"\n");
    }
}
