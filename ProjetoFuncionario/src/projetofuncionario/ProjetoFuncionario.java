package projetofuncionario;

import java.util.Scanner;

public class ProjetoFuncionario {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        Gerente gerente = new Gerente();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o salario do funcionario: ");
        double salario = scanner.nextDouble();
        
        funcionario.pagamento(salario);
        gerente.pagamento(salario);
        
    }
    
}
