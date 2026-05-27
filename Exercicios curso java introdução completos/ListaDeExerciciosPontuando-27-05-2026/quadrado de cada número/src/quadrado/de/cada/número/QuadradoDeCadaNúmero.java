/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quadrado.de.cada.número;

/**
 *
 * @author Admin
 */
public class QuadradoDeCadaNúmero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Quadrado de 5 numeros");
        for(int i=1; i<=5;i++){
            System.out.print("Digite o número " + i + ": ");
            int n = sc.nextInt();
            System.out.println("Quadrado de " + n + " = " + (n * n));
        }
        System.out.println();
    }
    
}
