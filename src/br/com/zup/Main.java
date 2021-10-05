package br.com.zup;

public class Main {

    public static void main(String[] args) {

        Imovel imovel = new Imovel("Casarão","Rua Z",1500);
        Funcionario funcionario = new Funcionario("Joao", "748596", 2500);
        Morador morador1 = new Morador("Pedro","142536",1500);
        Morador morador2 = new Morador("Joao","362514",2500);

        System.out.println(imovel);
        imovel.setFuncionarioResponsavel(funcionario);
        imovel.adicionarMoradores(morador1);
        imovel.adicionarMoradores(morador2);
        System.out.println(imovel);


    }
}
