package projetofuncionario;

public class Gerente implements Pessoa{
    
    @Override
    public void pagamento(double salario){
        double ajuste = salario + (salario*0.2);
        System.out.println("O gerente recebe "+ ajuste);
        
    }
    
}
