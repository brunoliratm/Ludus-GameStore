package Repositorio;

import Entidade.Produto;

import java.util.ArrayList;

public class RepositorioProduto {
    static ArrayList<Produto> repositorioJogos = new ArrayList<>();

    public void addJogo(Produto jogo){
        repositorioJogos.add(jogo);
    }
    public static boolean baixar(String nome){
        for (int i =0;i<=repositorioJogos.size();i++){
            if (repositorioJogos.get(i).getNome.equals(nome)){
                System.out.println("instalando");
                return true;
            }
        }
        return false;
    }
    public void jogosAdicionados(){
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

    public void verTodosProdutos(){
        System.out.println(repositorioJogos);
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

    public Produto verProdutoPorNome(String nome){

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