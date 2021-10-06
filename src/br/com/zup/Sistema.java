package br.com.zup;

import java.util.Scanner;

public class Sistema {


    public static Scanner capturarDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }


    public static void menu(){
        System.out.println("\n======Bem vindo======");
        System.out.println("Digite 1 - para cadastrar um imóvel.");
        System.out.println("Digite 2 - para exibir o cátalogo de imóveis.");
        System.out.println("Digite 3 - para sair.");
    }

    //receber dados do usuario
    public static String tituloDoImovel(){
        String titulo = capturarDados("Digite o título do Imóvel: ").nextLine();
        return titulo;
    }

    public static String enderecoImovel(){
        String endereco = capturarDados("Digite o endereço do Imóvel: ").nextLine();
        return endereco;
    }

    public static double valorAluguelImovel(){
        double valorAluguel = capturarDados("Digite o valor do aluguel do imóvel: ").nextInt();
        return valorAluguel;
    }

    public static String nomeFuncionario(){
        String nomeFuncionario = capturarDados("Digite o nome do Funcionário responsável: ").nextLine();
        return nomeFuncionario;
    }

    public static String cpfFuncionario(){
        String cpfFuncionario = capturarDados("Digite o cpf do Funcionário responsável: ").nextLine();
        return cpfFuncionario;
    }

    public static double salarioFuncionario(){
        double salario = capturarDados("Digite o sálario do Funcionário responsável: ").nextInt();
        return salario;
    }

    public static String nomeMorador(){
        String nomeMorador = capturarDados("Digite o nome do Morador: ").nextLine();
        return nomeMorador;
    }

    public static String cpfMorador(){
        String cpfMorador = capturarDados("Digite o cpf do Morador: ").nextLine();
        return cpfMorador;
    }

    public static double rendaMensalMorador(){
        double rendaMensal = capturarDados("Digite a renda mensal do Morador: ").nextInt();
        return rendaMensal;
    }

    public static Imovel cadastrarImovel(){
        Imovel imovel = new Imovel();
        imovel.setTituloImovel(tituloDoImovel());
        imovel.setEndereco(enderecoImovel());
        imovel.setValorAluguel(valorAluguelImovel());

        return imovel;
    }


    public static void executar(){

        Imobiliaria imobiliaria = new Imobiliaria("Imobolote");

        boolean exibirMenu = true;

        while(exibirMenu){

            menu();

            int opcaoSelecionada = capturarDados("\nDigite a opção desejada: ").nextInt();

            if (opcaoSelecionada == 1){
                //cadastrar um imóvel


            }else if (opcaoSelecionada == 2){
                //exibir cátalogo de imóveis


            }else if(opcaoSelecionada == 3){
                //sair
                exibirMenu = false;
                System.out.println("\nAté a proxima!");

            }else{
                System.out.println("\nA opção selecionada é inválida, digite novamente!");
            }

        }



    }

}
