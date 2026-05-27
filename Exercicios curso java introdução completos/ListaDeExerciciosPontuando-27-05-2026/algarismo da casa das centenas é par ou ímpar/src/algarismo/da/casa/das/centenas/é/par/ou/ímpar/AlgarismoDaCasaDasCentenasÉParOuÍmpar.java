/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algarismo.da.casa.das.centenas.é.par.ou.ímpar;

/**
 *
 * @author Admin
 */
public class AlgarismoDaCasaDasCentenasÉParOuÍmpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    System.out.println("Algarismo das centenas é par ou ímpar");
        System.out.print("Digite um número inteiro de 3 dígitos: ");
        int numero = sc.nextInt();
        int centenas = (Math.abs(numero) / 100) % 10;
        if (centenas % 2 == 0) {
            System.out.println("O algarismo das centenas (" + centenas + ") é PAR.");
        } else {
            System.out.println("O algarismo das centenas (" + centenas + ") é ÍMPAR.");
        }
        System.out.println();
}
