/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mesmo.exercício.com.pkgdo.pkgwhile;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class MesmoExercícioComDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("--- 2. Somar valores até digitar 0 (do-while) ---");
        int soma2 = 0;
        int valor2;
        do {
            System.out.print("Digite um valor (0 para parar): ");
            valor2 = sc.nextInt();
            soma2 += valor2;
            System.out.println("Soma atual: " + soma2);
        } while (valor2 != 0);
        System.out.println("Soma final: " + soma2);
 
        sc.close();
    }
    
}
