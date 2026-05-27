/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8somar.valores.até.digitar.pkg0;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class JavaApplication8SomarValoresAtéDigitar0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("--- 1. Somar valores até digitar 0 (while) ---");
        int soma = 0;
        int valor;
        System.out.print("Digite um valor (0 para parar): ");
        valor = sc.nextInt();
        while (valor != 0) {
            soma += valor;
            System.out.println("Soma atual: " + soma);
            System.out.print("Digite um valor (0 para parar): ");
            valor = sc.nextInt();
        }
        System.out.println("Soma final: " + soma + "\n");
    }
    
}
