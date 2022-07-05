/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationheranca;

/**
 *
 * @author Rodrigo
 */
public class Veiculo {
    
    // Atributos
    private String marca;
    private String modelo;
    private String cor;
    private int motor;
    
    // construtor 
    public Veiculo(String marca, String modelo, String cor, int motor){
      this.marca = marca;
      this.modelo = modelo;
      this.cor = cor;
      this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        
        this.modelo = modelo;
    }

    public String getCor() {
        
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }  
    
    // método imprimir
    public void imprimir(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Cor: "+ cor);
        System.out.println("Motor: "+motor);
    }
    
}
