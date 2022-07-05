/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationheranca;

/**
 *
 * @author Rodrigo
 */
public class JavaApplicationHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // construir o objeto carro
        
        Carro c1 = new Carro("Volvo", "C500", "Preto", 1, 5);
        
        // exibir atributos do carro
        // c1.imprimir(); // (marca modelo cor motor)
        
        /* imprimir os atributos da superclasse (veículo)
           + da subclasse (Carro) */
        c1.imprimir();
        
        /* 
        FOI SUBSTITUÍDO PELO MÉTODO IMPRIMIR()
        
        System.out.println("Marca: "+c1.getMarca());
        System.out.println("Modelo: "+c1.getModelo());
        System.out.println("Cor: "+c1.getCor());
        System.out.println("Motor: "+c1.getMotor());
        System.out.println("Rodas: "+c1.getRodas());*/
        
    }
    
}
