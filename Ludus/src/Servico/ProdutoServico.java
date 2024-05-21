package Servico;

import Repositorio.RepositorioProduto;
import Tratamento.Tratamentos;

import java.util.Scanner;

public class ProdutoServico {
    public static void menuProduto(Scanner input) throws InterruptedException {
        int loop = 1;
        do {
            try {


                System.out.println("Menu do Produto");
                System.out.println("""
                        \n
                        [1] - Adicionar novo jogo
                        [2] - Ver todos os jogos
                        [3] - Remover jogo
                        [4] - Buscar por nome
                        [5] - Voltar ao Menu do Adm
                        """);
                System.out.print("\n-->");
                int escolha = input.nextInt();
                switch (escolha) {
                    case 1:
                        input.nextLine();
                        System.out.println("Nome do jogo ");
                        String nome = input.nextLine();
                        System.out.println("Genero");
                        String genero = input.nextLine();
                        System.out.println("Ano de lançamento");
                        int anoLancamento = input.nextInt();
                        input.nextLine();
                        System.out.println();
                        System.out.println("Plataforma suportada");
                        String plataforma = input.nextLine();
                        System.out.println("N° de jogadores");
                        int numeroJogadores = input.nextInt();
                        input.nextLine();
                        System.out.println();
                        System.out.println("Online? [s]-sim | [n]-não");
                        String online = input.nextLine();
                        if (online.equalsIgnoreCase("s"))
                            RepositorioProduto.addJogo(nome, genero, anoLancamento, plataforma, numeroJogadores, true);
                        if (online.equalsIgnoreCase("n"))
                            RepositorioProduto.addJogo(nome, genero, anoLancamento, plataforma, numeroJogadores, false);
                        else System.out.println("Digite apenas [s]-sim || [n]-não");
                        Thread.sleep(3000);
                        break;
                    case 2:
                        RepositorioProduto.verTodosProdutos();
                        Thread.sleep(3000);
                        break;
                    case 3:
                        input.nextLine();
                        System.out.println();
                        System.out.println("Digite o nome do jogo que vai ser removido");
                        String nomeExcluido = input.nextLine();
                        RepositorioProduto.removerProduto(nomeExcluido);
                        Thread.sleep(3000);
                        break;
                    case 4:
                        input.nextLine();
                        System.out.println();
                        System.out.println("Digite o nome do jogo que você busca");
                        String buscaPorNome = input.nextLine();
                        RepositorioProduto.verProdutoPorNome(buscaPorNome);
                        Thread.sleep(3000);
                        break;
                    case 5:
                        loop = 0;
                }
            }catch (InterruptedException e){
                Tratamentos.opcaoInvalida();
            }catch (Exception e){
                Tratamentos.opcaoInvalida();
            }
        }while (loop==1);

    }
}
