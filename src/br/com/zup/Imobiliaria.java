package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {

    private String nomeImobiliaria;
    private List<Imovel> catalogoImoveis = new ArrayList<>();


    public Imobiliaria() {
    }

    public Imobiliaria(String nomeImobiliaria) {
        this.nomeImobiliaria = nomeImobiliaria;
    }


    public String getNomeImobiliaria() {
        return nomeImobiliaria;
    }

    public void setNomeImobiliaria(String nomeImobiliaria) {
        this.nomeImobiliaria = nomeImobiliaria;
    }


    //Métodos
    public void adicionarImoveis(Imovel imovel){
        catalogoImoveis.add(imovel);
        System.out.println("\nImovél cadastrado com sucesso e adicionado ao catálogo!");
    }

    public List<Imovel> exibirImoveis(){
        for (Imovel referencia : catalogoImoveis){
            System.out.println(referencia);
        }

        return  catalogoImoveis;
    }

    public Imovel exibirImovelEspecifico(String enderecoImovel){

        Imovel imovelEspecifico = null;

        for (Imovel referencia : catalogoImoveis){
            if (referencia.getEndereco().equals(enderecoImovel)){
                imovelEspecifico = referencia;
            }
        }

        return imovelEspecifico;
    }


    @Override
    public String toString() {
        StringBuilder exibir = new StringBuilder();
        exibir.append("\n======" + nomeImobiliaria + "======\n");
        exibir.append("\n======Catálogo======" + catalogoImoveis);
        return exibir.toString();
    }

}
