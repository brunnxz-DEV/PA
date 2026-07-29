package exercicio.pkg1;
import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {
    //Declaração de variáveis
    int A=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de A."));
    int B=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de B."));
    int C=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de C."));
    int soma=A+B;       //Variável para o resultado da soma de A e B
    if(soma > C)
        JOptionPane.showMessageDialog(null, "A soma de A e B e maior que C");
    else
        JOptionPane.showMessageDialog(null, "A soma de A e B e menor que C");
    }
    
}