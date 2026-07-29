package exercicio.pkg2;
import javax.swing.JOptionPane;
public class Exercicio2 {
public static void main(String[] args) {
    //Declaração da variavel do número digitado pelo usuário
    int Num=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero qualquer"));
    //Definição de par e impar do número digitado
    if(Num %2 == 0)
        JOptionPane.showMessageDialog(null, "O numero " + Num + " e par");
    else
        JOptionPane.showMessageDialog(null, "O numero " + Num + " e impar");
    //Definição de positivo e negativo do número digitado
    if(Num >= 0)
        JOptionPane.showMessageDialog(null, "O numero " + Num + " e positivo");
    else
        JOptionPane.showMessageDialog(null, "O numero " + Num + " e negativo");
    }  
}
