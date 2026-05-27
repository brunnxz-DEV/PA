/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package números.maiores.que.pkg30;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class NúmerosMaioresQue30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Utilização do for
        int contMaior30=0;
        for(int i=1; i<=15; i++){
            String numUsu= JOptionPane.showInputDialog(null,"Digite os numero "+i+" de 15:");
            int num=Integer.parseInt(numUsu);
            if(num>30){
                contMaior30++;
            }
        }
    System.out.println(contMaior30);
    }
}
