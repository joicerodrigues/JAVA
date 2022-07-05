/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JOptionPane;
import view.Principal;
import view.Calculadora;

/**
 *
 * @author aluno.si
 */
public class Validacao {
    
    //atributos
    private final String usuario = "Joice";
    private final String senha = "123";
    
    //Geral g = new Geral(); // instanciar objeto de Geral
    Calculadora calc = new Calculadora(); // instanciar objeto calculadora
    //Principal p = new Principal(); // instanciar objeto principal (login)
    
    public boolean comparar(String usuario, String senha)
    {
        
        if(this.usuario.equals(usuario) && this.senha.equals(senha))
        {
            calc.setVisible(true); //exibe a calculadora
            //p.dispose(); // fecha a tela de login (Principal) sem fechar o programa
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!", "Aviso", 2);
            return false;
        }
                
        
    }
    
}
