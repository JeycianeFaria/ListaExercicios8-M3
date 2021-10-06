package br.com.zup;

public class Morador extends Pessoa {

    private double rendaMensal;
    private String email;


    public Morador() {
    }

    public Morador(String nome, String cpf, double rendaMensal, String email) {
        super(nome, cpf);
        this.rendaMensal = rendaMensal;
        this.email = email;
    }


    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
