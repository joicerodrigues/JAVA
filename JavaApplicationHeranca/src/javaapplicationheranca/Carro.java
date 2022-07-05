/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationheranca;

/**
 *
 * @author Rodrigo
 */

// extends => herdar da superclasse
public class Carro extends Veiculo{
    
    // atributo 
    private int rodas;
    
    // construtor 
    public Carro(String marca, String modelo, String cor, int motor, int rodas){
     // chamar o construtor da superclasse veículo
       super(marca, modelo, cor, motor);
       this.rodas = rodas;
    }
    
    // getrodas
    public int getRodas(){
    
      return this.rodas;
    }
    
    @Override
    public void imprimir(){
        
      super.imprimir(); // método imprimir da superclasse (veículo)
      System.out.println("Rodas: "+rodas);
    
    }
    
    
}
