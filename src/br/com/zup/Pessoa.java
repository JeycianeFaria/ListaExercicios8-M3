package br.com.zup;

public abstract  class Pessoa {

    private String nome;
    private String cpf;


    public Pessoa() {
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    //Métodos
    @Override
    public String toString() {
        StringBuilder exibir = new StringBuilder();
        exibir.append("\nNome: " + nome);
        exibir.append("\nCpf: " + cpf);
        return exibir.toString();
    }

}
