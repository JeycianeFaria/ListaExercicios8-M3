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


}
