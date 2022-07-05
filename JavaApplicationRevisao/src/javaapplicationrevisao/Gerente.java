package javaapplicationrevisao;

public class Gerente extends Funcionario {

    private double novoSalario;
    
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    
    @Override
    public double getSalario(){
        novoSalario = (super.getSalario() * 1.20);
            return novoSalario;
    }
    
}
