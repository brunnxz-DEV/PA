/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo.verificação.de.senha;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class AlgoritmoVerificaçãoDeSenha {
    
    public static void main(String[] args) {
    String senha=JOptionPane.showInputDialog(null,"Digite a senha");
    if(senha.equals("abcd")){
      JOptionPnae.showMessageDialog(null,"Senha correta, acesso permitido.");}
    else{
        JOptionPane.showMessageDialog(null,"Senha incorreta, acesso negado.");}
    }
}
