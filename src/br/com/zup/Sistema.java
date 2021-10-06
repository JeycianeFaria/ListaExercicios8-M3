package br.com.zup;

import java.util.Scanner;

public class Sistema {


    public static Scanner capturarDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }


    public static void menu(){
        System.out.println("\n======Bem vindo======");
        System.out.println("\nDigite 1 - para cadastrar um imóvel.");
        System.out.println("\nDigite 2 - para exibir o cátalogo de imóveis.");
        System.out.println("\nDigite 3 - para sair.");
    }

}
