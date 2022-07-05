package javaapplication2;

public class Calculadora {
    
    // Atributos da Classe calculadora
    private double resultadoSoma;
    private double resultadoSubtracao;
    private double resultadoMultiplicacao;
    private double resultadoDivisao;

    // Método soma
    public void soma(double valor1, double valor2){
        
        resultadoSoma = valor1 + valor2;
        
        System.out.println("Resultado da soma é: " + resultadoSoma);
        
    }
    
    // Método subtração
    public void subtracao(double valor1, double valor2){
        
        resultadoSubtracao = valor1 - valor2;
        
        System.out.println("Resultado da subtração é: " + resultadoSubtracao);
        //return resultadoSubtracao;
    }
    
    // Método multiplicação
    public void multiplicacao(double valor1, double valor2){
        
        resultadoMultiplicacao = valor1 * valor2;
        
        System.out.println("Resultado da multiplicação é: " + resultadoMultiplicacao);
        
    }
    
    // Método divisão
    public void divisao(double valor1, double valor2){
        
        resultadoDivisao = valor1 / valor2;
        
        System.out.println("Resultado da divisão é: " + resultadoDivisao);
        //return resultadoDivisao;
    }
    
    
}
