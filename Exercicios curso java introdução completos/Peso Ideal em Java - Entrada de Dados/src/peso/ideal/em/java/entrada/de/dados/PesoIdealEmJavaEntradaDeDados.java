/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package peso.ideal.em.java.entrada.de.dados;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class PesoIdealEmJavaEntradaDeDados {
public static void main(String[]args){
    String sexo=JOptionPane.showInputDialog(null,"Digite seu sexo, masc ou fem");
    double altura=Double.parseDouble(JOptionPane.showInputDialog(null,"Qual sua altura?"));
    double peso=Double.parseDouble(JOptionPane.showInputDialog(null,"Qual seu peso?"));
    double pesoideal;
    if(sexo=="masc")
        pesoideal=(72.7*altura)-58;
    else
        pesoideal=(62.1*altura)-44.7;
    System.out.println("Seu peso ideal e: "+pesoideal);
}    
}
