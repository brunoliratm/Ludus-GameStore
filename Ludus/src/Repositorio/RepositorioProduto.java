package Repositorio;

import Entidade.Produto;

import java.util.ArrayList;

public class RepositorioProduto {
     ArrayList repositorioJogos = new ArrayList<Produto>();

    public  void verProduto(){
        System.out.println("Listando os jogos\n");
        for ( Produto p : repositorioJogos){

                System.out.println("Genero: "p.getGenero());
        }
    }

}
