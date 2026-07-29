package exercicio.pkg3;
import javax.swing.JOptionPane;
public class Exercicio3 {
    public static void main(String[] args) {
    //Declaração das variáveis
    int A=Integer.parseInt(JOptionPane.showInputDialog(null, "digite o numero A"));
    int B=Integer.parseInt(JOptionPane.showInputDialog(null, "digite o numero B"));
    int C=Integer.parseInt(JOptionPane.showInputDialog(null, "digite o numero C"));
    int AsB;        //Soma de A e B
    int AmB;        //Multiplicação de A e B
    int ABsC;       //Soma de AB e C
    //Esse if é utilizado para determinar se A e B são iguais, caso isso for verdadeiro, A e B serão somados, depois AB é somado a C
    if(A == B){
        AsB = A + B;        //Soma de A e B
        JOptionPane.showMessageDialog(null, "A soma de A + B e " + AsB);
        ABsC = AsB + C;     //Soma de AB e C
        JOptionPane.showMessageDialog(null, "A soma de AB + C e " + ABsC);
    }
    //Esse if é utilizado quando A é diferente de B, caso isso for verdadeiro, A e B serão multiplicados e dopois somados a C
    if(A != B){
        AmB = A * B;        //Multiplicação de A e B
        JOptionPane.showMessageDialog(null, "A multiplicacao de A x B e " + AmB);
        ABsC = AmB + C;     //Soma de AB e C
        JOptionPane.showMessageDialog(null, "A soma de AB + C e " + ABsC);
    }
  }
}