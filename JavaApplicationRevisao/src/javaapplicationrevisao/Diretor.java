package javaapplicationrevisao;

public class Diretor extends Funcionario{

    private double novoSalario;
        
    public Diretor(String nome, double salario) {
        super(nome, salario);
    }
    
    @Override
    public double getSalario(){
        novoSalario = (super.getSalario() * 1.40);
            return novoSalario;
    }
    
    
}
