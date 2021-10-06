package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Imovel {

    private  String tituloImovel;
    private String endereco;
    private double valorAluguel;
    private Funcionario funcionarioResponsavel;
    private List<Morador> moradores = new ArrayList<>();


    public Imovel() {
    }

    public Imovel(String tituloImovel, String endereco, double valorAluguel) {
        this.tituloImovel = tituloImovel;
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
    }


    public String getTituloImovel() {
        return tituloImovel;
    }

    public void setTituloImovel(String tituloImovel) {
        this.tituloImovel = tituloImovel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public Funcionario getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(Funcionario funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public List<Morador> getMoradores() {
        return moradores;
    }


    //Métodos
    public void adicionarMoradores(Morador morador){
        moradores.add(morador);
    }

    @Override
    public String toString() {
        StringBuilder exibir = new StringBuilder();
        exibir.append("\n======" + tituloImovel + "======");
        exibir.append("\nEndereço: " + endereco);
        exibir.append("\nValor do Aluguel: " + valorAluguel);
        exibir.append("\nFuncionário Responsável: " + funcionarioResponsavel);
        exibir.append("\nQuantidade de moradores: " + moradores.size());
        exibir.append("\n======Moradores======" + moradores);
        return exibir.toString();
    }

}