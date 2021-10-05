package br.com.zup;

public class Funcionario extends Pessoa{

    private double salario;;


    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    //Métodos
    @Override
    public String toString() {
        StringBuilder exibir = new StringBuilder();
        exibir.append("\n======Corretor======");
        exibir.append(super.toString());
        exibir.append("\nSalário: R$ " + salario);
        exibir.append("\n=====================");
        return exibir.toString();
    }

}
