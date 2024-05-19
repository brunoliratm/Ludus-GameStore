package Repositorio;

import Entidade.Produto;

import java.util.ArrayList;
import java.util.SortedMap;

public class RepositorioProduto {
    static ArrayList<Produto> repositorioJogos = new ArrayList<>();

    public static void addJogo(String nome, String genero, int anoLancamento, String plataforma, int numeroJogadores, boolean online) {
        boolean jogoJaPresente = false;
        for (Produto produto : repositorioJogos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Jogo já está presente no Ludus");
                jogoJaPresente = true;
                break;
            }
        }

        if (!jogoJaPresente) {
            System.out.println("Adicionou");
            repositorioJogos.add(new Produto(nome, genero, anoLancamento, plataforma, numeroJogadores, online));
        }
    }


    public static void jogosAdicionados(){
        repositorioJogos.add(new Produto("Grand Theft Auto V", "Ação e Aventura", 2013, "PlayStation 3, PlayStation 4, Xbox 360, Xbox One, PC", 1, true));
        repositorioJogos.add(new Produto("Red Dead Redemption 2", "Ação e Aventura", 2018, "PlayStation 4, Xbox One, PC", 1, true));
        repositorioJogos.add(new Produto("The Witcher 3: Wild Hunt", "RPG", 2015, "PC, PlayStation 4, Xbox One, Nintendo Switch", 1, true));
        repositorioJogos.add(new Produto("God of War (2018)", "Ação e Aventura", 2018, "PlayStation 4", 1, true));
        repositorioJogos.add(new Produto("Horizon Zero Dawn", "RPG de Ação", 2017, "PlayStation 4", 1, true));
        repositorioJogos.add(new Produto("Bloodborne", "RPG de Ação", 2015, "PlayStation 4", 1, true));
        repositorioJogos.add(new Produto("Uncharted 4: A Thief's End", "Ação e Aventura", 2016, "PlayStation 4", 1, true));
        repositorioJogos.add(new Produto("Super Mario Odyssey", "Plataforma", 2017, "Nintendo Switch", 1, false));
        repositorioJogos.add(new Produto("The Legend of Zelda: Breath of the Wild", "Aventura", 2017, "Nintendo Switch", 1, false));
        repositorioJogos.add(new Produto("Uncharted 2: Among Thieves", "Ação e Aventura", 2009, "PlayStation 3", 1, false));
    }
    public void recomendacoes(){
        System.out.println("Recomendações para você: ");
        int indice = (int) (Math.random() * repositorioJogos.size());
        Produto recomendacao = repositorioJogos.get(indice);
        System.out.print(recomendacao);
        indice = (int) (Math.random() * repositorioJogos.size());
        recomendacao = repositorioJogos.get(indice);
        System.out.print(recomendacao);
        indice = (int) (Math.random() * repositorioJogos.size());
        recomendacao = repositorioJogos.get(indice);
        System.out.println(recomendacao);
    }

    public static void verTodosProdutos(){
        System.out.println(repositorioJogos);
    }

    public static void removerProduto(String nomeJogo){
        boolean contemJogo=true;
        for (Produto produto : repositorioJogos) {
            if (produto.getNome().equals(nomeJogo)){
                repositorioJogos.remove(produto);
                System.out.println("Jogo "+ nomeJogo+" foi excluido");
                contemJogo=false;
                break;
            }
        }
        if (contemJogo){
            System.out.println("Jogo não foi encontrado no Ludus");
        }
    }

    public static Produto verProdutoPorNome(String nome){

        for (Produto jogo : repositorioJogos) {
            if (jogo.getNome().equalsIgnoreCase(nome) && jogo.getNome().startsWith(nome)) {
                System.out.println(jogo);
                return jogo;
            }
        }
        System.out.println("Não foi encontrado nenhum jogo com esse nome "+ nome);
       return null;
    }

}