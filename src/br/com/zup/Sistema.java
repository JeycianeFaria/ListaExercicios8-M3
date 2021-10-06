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

            /* System.out.println("\nDigite 1 - para cadastrar um imóvel.");
        System.out.println("\nDigite 2 - para exibir o cátalogo de imóveis.");
        System.out.println("\nDigite 3 - para sair.");*/
        }



    }

}
