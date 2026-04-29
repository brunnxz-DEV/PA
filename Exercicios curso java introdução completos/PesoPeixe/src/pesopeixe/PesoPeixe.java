/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pesopeixe;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;
public class PesoPeixe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double peso=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o peso dos peixes em KG"));
        double multa = 0;
        if (peso>50){
            multa=(peso-50)*4;
        JOptionPane.showMessageDialog(null,"Multa por peso excedente total: "+multa);}
        if (peso<=50){
            JOptionPane.showMessageDialog(null,"Não houve multa por peso excedente.");
        }  
    }
}
