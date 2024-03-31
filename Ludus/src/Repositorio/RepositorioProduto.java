package Repositorio;

import Entidade.Produto;

import java.util.ArrayList;

public class RepositorioProduto {
    ArrayList<Produto> repositorioJogos = new ArrayList<>();

    public void addJogo(Produto jogo){
        repositorioJogos.add(jogo);
    }


    public void verProdutoPorGenero(String genero){

        ArrayList<Produto> jogosFiltrados = new ArrayList<>();
        for (Produto jogo : repositorioJogos) {
            if (jogo.getGenero().equalsIgnoreCase(genero)) {
                jogosFiltrados.add(jogo);
            }
        }
        if (jogosFiltrados.isEmpty()) {
            System.out.println("Nenhum jogo encontrado para o gênero " + genero);
        } else {
            System.out.println("Jogos do gênero " + genero + ":");
            for (Produto jogo : jogosFiltrados) {
                System.out.println(" - " + jogo.getNome());
            }
        }
    }

    public void verTodosProdutos(){
        for (Produto jogo: repositorioJogos){
            System.out.println("Jogo: "+jogo.getNome()+jogo.getAnoLancamento()+" genero: "+jogo.getGenero()+"\n"+"Plataforma: "+jogo.getPlataforma()+" Nº downloads: "+jogo.getNumeroJogadores()+" Online: "+jogo.isOnline());
        }
    }

    public void removerProduto(String nomeJogo){
        for (Produto produto : repositorioJogos) {
            if (produto.getNome.equals(nomeJogo)){
                repositorioJogos.remove(produto);
                System.out.println("Jogo "+ nomeJogo+" foi excluido");
            }else{
                System.out.println("Buscar na classe de tratamento");
            }
        }
    }

    public void verProdutoPorNome(String nome){

        ArrayList<Produto> jogosFiltrados = new ArrayList<>();
        for (Produto jogo : repositorioJogos) {
            if (jogo.getNome().equalsIgnoreCase(nome)) {
                jogosFiltrados.add(jogo);
            }
        }
        if (jogosFiltrados.isEmpty()) {
            System.out.println("Nenhum jogo encontrado com o nome '" + nome+"'");
        } else {
            System.out.println("Jogos com o nome '" + nome + "' :");
            for (Produto jogo : jogosFiltrados) {
                System.out.println("Jogo: "+jogo.getNome()+jogo.getAnoLancamento()+" genero: "+jogo.getGenero()+"\n"+"Plataforma: "+jogo.getPlataforma()+" Nº downloads: "+jogo.getNumeroJogadores()+" Online: "+jogo.isOnline());
            }
        }
    }

}