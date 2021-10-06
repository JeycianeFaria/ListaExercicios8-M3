package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Imovel {

    private String tituloImovel;
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

    public List<Morador> getMoradores() {
        return moradores;
    }


    //Métodos
    public boolean verificaCpfMorador(Morador morador) {

        boolean cpfExistente = false;

        for (Morador referencia : moradores) {
            if (referencia.getCpf().equals(morador.getCpf())) {
                cpfExistente = true;
                break;
            }
        }

        return cpfExistente;
    }

    public boolean verificarEmailMorador(Morador morador) {

        boolean emailValido = true;

        if (!morador.getEmail().contains("@")) {
            emailValido = false;
        }

        for (Morador referencia : moradores) {
            if (referencia.getEmail().equals(morador.getEmail())) {
                emailValido = false;
                break;
            }
        }

        return emailValido;
    }

    public void adicionarMorador(Morador morador) {

        if (verificaCpfMorador(morador)) {
            System.out.println("Morador com este cpf já cadastrado.Digite novamente!");
        } else if (!verificarEmailMorador(morador)) {
            System.out.println("Email digitado inválido ou já cadastrado.Digite novamente!");
        } else {
            moradores.add(morador);
            System.out.println("Morador adicionado com sucesso!");
        }

    }

    public void removerMorador(String pegarCPF) {

        Morador moradorARemover = null;

        for (Morador referencia : moradores) {
            if (referencia.getCpf().equals(pegarCPF)) {
                moradorARemover = referencia;
            }
        }

        moradores.remove(moradorARemover);
        System.out.println("Morador removido com sucesso!");

    }

    public void adicionarFuncionarioResponsavel(Funcionario funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
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
