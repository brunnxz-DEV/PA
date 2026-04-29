/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo.verificação.de.idade;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class AlgoritmoVerificaçãoDeIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int anonasc=int.parseInt(JOptionPane.showInputDialog(null,"Qual seu ano de nascimento?"));
        String anoatual=JOptionPane.showInputDialog(null,"Qual o ano atual?0");
        int idade=anoatual - anonasc;
   }
    
}
