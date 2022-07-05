package projetoexceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProjetoExceptions {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x = 0;
        
        try{
            System.out.println("Digite um numero: ");
            x = sc.nextInt();  
            x = x/0;
        }
        catch(InputMismatchException e){
            System.out.println("Exception: " + e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println("Você dividiu por 0");
            x = 0;
        }
        finally{
            
            System.out.println("Sempre executa");
            x = 5;
        }
        
        System.out.println("Valor de X: " + x);
                
        
    }
    
}
