package javaapplication3;
import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        
        /* ---- Atributos ---- */ 
        int comida, input;
        
        int valor1;
        double valor2;
        String valor3;
        boolean valor4;
        
        // Instanciando a classe scanner para receber valores do usuário no console
        Scanner sc = new Scanner(System.in);
        
        // Para receber o valor digitado no console pelo usuário
        System.out.println("Digite o valor da comida: ");
        input = sc.nextInt();
        
        /* ---- Instanciar o objeto cachorro ---- */ 
        Cachorro c = new Cachorro();
        
        
        /* ---- Chamando método com multimos parametros  ---- */
        System.out.println("Digite o valor 1: ");
        valor1 = sc.nextInt();
        
        System.out.println("Digite o valor 2: ");
        valor2 = sc.nextDouble();
        
        System.out.println("Digite o valor 3: ");
        valor3 = sc.next();
        
        System.out.println("Digite o valor 4: ");
        valor4 = sc.nextBoolean();
        
        c.variosParametros(valor1, valor2, valor3, valor4);
        
        /* ---- Atribuir o retorno do método a uma variavel ---- */ 
        comida = c.comer(input);
        System.out.println(comida);
        
        /* ---- Chamando o método sem retorno ---- */ 
        c.latir();
    }
}
