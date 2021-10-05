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

    public void setCatalogoImoveis(List<Imovel> catalogoImoveis) {
        this.catalogoImoveis = catalogoImoveis;
    }

}
