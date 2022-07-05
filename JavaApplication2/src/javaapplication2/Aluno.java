package javaapplication2;

// declaração da classe
public class Aluno {

   // atributos do objeto Aluno
   public int id;
   public int idade;
   public String nome;
   public String turma;
   
   // declarando o método
    public void imprimirValores(int valor){

        System.out.println("Imprimindo Valores... " + valor);
    }
    
    // declarando metodo com retorno
    public int retonaInteiro(int y){
        return y;
    }
}