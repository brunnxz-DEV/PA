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
    String senhacorr="abcd";
    if(senha==senhacorr)
        System.out.println("Senha correta! Acesso permitido");
    else
        System.out.println("Senha incorreta! Acesso negado");
    
    }
    
}
