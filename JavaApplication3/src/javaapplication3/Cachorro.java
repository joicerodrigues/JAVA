package javaapplication3;

public class Cachorro {
    
    /* ---- Atributos ---- */ 
    private String raca;
    private String cor;
    private String nome;
    private String porte;
    private int idade;
    
    
    /* ---- Métodos ---- */
    
    // Método sem retorno
    public void latir() {
        System.out.println("Au au");
    }
    
    // Método com multiplos parametros
    public void variosParametros(int valor1, double valor2, String valor3, boolean valor4) {
         System.out.println("Valor 1: " + valor1);
         System.out.println("Valor 2: " + valor2);
         System.out.println("Valor 3: " + valor3);
         System.out.println("Valor 4: " + valor4);
    }
    
    // Método com parametro e retorno
    public int comer(int comida) {
       return comida;
    }
    
}
