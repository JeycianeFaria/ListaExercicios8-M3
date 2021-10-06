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

    public List<Imovel> getCatalogoImoveis() {
        return catalogoImoveis;
    }


    //Métodos
    public void adicionarImoveis(Imovel imovel){
        catalogoImoveis.add(imovel);
    }

    @Override
    public String toString() {
        StringBuilder exibir = new StringBuilder();
        exibir.append("\n======" + nomeImobiliaria + "======\n");
        exibir.append("\n======Catálogo======" + catalogoImoveis);
        return exibir.toString();
    }

}
