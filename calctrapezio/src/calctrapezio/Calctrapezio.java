/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calctrapezio;

/**
 *
 * @author aula
 */

import javax.swing.JOptionPane;

public class Calctrapezio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         double basea, baseb,  altura, area; 

        basea = Double.parseDouble( JOptionPane.showInputDialog("digite o valor da base MAIOR"));
        baseb = Double.parseDouble( JOptionPane.showInputDialog("digite o valor da base MENOR"));
        altura = Double.parseDouble( JOptionPane.showInputDialog("digite o valor da altura"));
        
        area = (basea + baseb) * altura /2;
        
        JOptionPane.showMessageDialog(null, "área do triangulo é = " + area);
    }
    
}
