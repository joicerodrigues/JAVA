package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {
  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();      
        
        int op = 0;
        double valor1, valor2;
       
            while(op != -1){

            System.out.println("\t Bem-vindo a Calculadora FATEC");

            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("-1 - SAIR");

            System.out.println("Digite a operação desejada: ");
            // Recebe o valor digitado pelo teclado
            op = sc.nextInt();

            if(op != -1){

            System.out.println("Digite o valor 1: ");
            valor1 = sc.nextDouble();

            System.out.println("Digite o valor 2: ");
            valor2 = sc.nextDouble();

                switch (op) {
                    case 1:

                        // Soma
                        calc.soma(valor1, valor2);
                        break;

                    case 2:

                        // Subtração
                        calc.subtracao(valor1, valor2);
                        break;

                    case 3:

                        // Multiplicação
                        calc.multiplicacao(valor1, valor2);
                        break;

                    case 4:

                        // Divisão
                        calc.divisao(valor1, valor2);
                        break;

                } // fim switch case
            } // fim if
        } // fim while
    }   // fim main
} // fim classe
