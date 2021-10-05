package br.com.zup;

public class Morador extends Pessoa {

    private double rendaMensal;


    public Morador() {
    }

    public Morador(String nome, String cpf, double rendaMensal) {
        super(nome, cpf);
        this.rendaMensal = rendaMensal;
    }


    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }


    //Métodoa
    @Override
    public String toString() {
        StringBuilder exibir = new StringBuilder();
        exibir.append(super.toString());
        exibir.append("\nRenda mensal: R$ " + rendaMensal);
        exibir.append("\n=====================");
        return exibir.toString();
    }

}
