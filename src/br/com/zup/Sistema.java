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
        System.out.println("Digite 3 - para remover um morador de um imóvel.");
        System.out.println("Digite 4 - para sair.");
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

    public static String emailMorador(){
        String email = capturarDados("Digite o email do Morador: ").nextLine();
        return email;
    }

    public static Imovel cadastrarImovel(){
        Imovel imovel = new Imovel(tituloDoImovel(),enderecoImovel(),valorAluguelImovel());
        return imovel;
    }

    public static Funcionario cadastrarFuncionario(){
        Funcionario funcionario = new Funcionario(nomeFuncionario(),cpfFuncionario(),salarioFuncionario());
        return funcionario;
    }

    public static Morador cadastrarMoradores(){
        Morador morador = new Morador(nomeMorador(),cpfMorador(),rendaMensalMorador(), emailMorador());
        return morador;
    }

    public static Imovel adicionarMoradoresImovel(Imovel imovel){
        int qtdMoradores = capturarDados("Digite a quantidade de moradores que deseja cadastrar: ").nextInt();


        while (imovel.getMoradores().size() < qtdMoradores){
                int contador = imovel.getMoradores().size() + 1;

                System.out.println("\nCadastre o " + contador + "º morador:");
                Morador morador = cadastrarMoradores();
                imovel.adicionarMorador(morador);

        }


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
                Imovel imovel = cadastrarImovel();
                imovel.adicionarFuncionarioResponsavel(cadastrarFuncionario());
                adicionarMoradoresImovel(imovel);
                imobiliaria.adicionarImoveis(imovel);

            }else if (opcaoSelecionada == 2){
                //exibir cátalogo de imóveis
                imobiliaria.exibirImoveis();

            }else if (opcaoSelecionada == 3){
                //remover morador
                Imovel imovel = imobiliaria.exibirImovelEspecifico(capturarDados("Digite o endereço do imóvel que deseja excluir um morador: ").nextLine());
                System.out.println("\nO imovél encontrado foi:" + imovel);
                imovel.removerMorador(capturarDados("Digite o cpf do morador que deseja remover: ").nextLine());
                System.out.println("\nOs dados atualizados do imovél é: " + imovel);

            } else if(opcaoSelecionada == 4){
                //sair
                exibirMenu = false;
                System.out.println("\nAté a proxima!");

            }else{
                System.out.println("\nA opção selecionada é inválida, digite novamente!");
            }

        }



    }

}
