package Repositorio;

import Entidade.Produto;

import java.util.ArrayList;

public class RepositorioProduto {
    static ArrayList<Produto> repositorioJogos = new ArrayList<>();

    public static void verProduto(){
        System.out.println("Listando os jogos\n");
        for (Produto p : repositorioJogos){
            System.out.println("Genero: "+p.getGenero());
        }
    }

}
