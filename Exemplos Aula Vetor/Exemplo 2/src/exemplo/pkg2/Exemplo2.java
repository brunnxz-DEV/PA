/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo.pkg2;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class Exemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[] = new int [10];
        int contp = 0, somai = 0, i = 0, l = 0;
        for (i = 0; i <= 9; i++){
            l = i + 1;
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + l + "º número"));
            if (v[i] % 2 == 1){
                somai += v[i];
            }
            else{
                contp ++;
            }
        }
    }
    
}
