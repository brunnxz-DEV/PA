/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verificaçãoidade;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class VerificaçãoIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String anonasc=JOptionPane.showInputDialog("Diga seu ano de nascimento");
        int anis=Integer.parseInt(anonasc);
        int idade=2026-anis;
        if(idade>=18){
            JOptionPane.showMessageDialog(null,"Voce e maior de idade, sua idade e "+idade+" anos");
        }else{
            JOptionPane.showMessageDialog(null,"Voce nao e maior de idade, porque sua idade e "+idade+" anos");
        }
   }
    
}