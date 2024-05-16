package GUI;


import Entidade.Usuario;
import Repositorio.RepositorioProduto;

import Servico.Download;
import Tratamento.Tratamentos;


import java.time.LocalDate;
import java.util.Scanner;

public class MainLudus {

    public static void menuDeJogos(Usuario user) throws InterruptedException {
        RepositorioProduto repositorioProduto = new RepositorioProduto();
        Scanner input = new Scanner(System.in);
        repositorioProduto.jogosAdicionados();
        String escolhaString;
        int escolhaInt;
        int loop = 1;
        while (loop == 1) {
            try {
                System.out.println("==== LUDUS GAME-STORE ====\n");
                System.out.print("Bem-vindo(a) " + user.getNome() + "!\n");
                System.out.println("Data: " + LocalDate.now()+'\n');
                repositorioProduto.recomendacoes();

                System.out.println('\n'+"""
                        [1] - Buscar jogos por nome
                        [2] - Ver todos os jogos
                        [3] - Ver seus jogos
                        [4] - Retornar ao menu de Login
                        [5] - Sair
                        """);
                System.out.print("--> ");
                escolhaInt = Integer.parseInt(input.nextLine());
                switch (escolhaInt) {

                    case 1:
                        System.out.println("Qual jogo você busca?");
                        escolhaString = input.nextLine();
                        if (repositorioProduto.verProdutoPorNome(escolhaString) == null) {
                            System.out.println("Sentimos muito...");
                        } else {
                            System.out.println("Deseja instalar?");
                            System.out.println("[s] - sim\n[n] - não");
                            String sOrN = input.nextLine();
                            if (sOrN.equalsIgnoreCase("s")) {
                                Download.baixarProdurto();
                                user.setMeusJogos(repositorioProduto.verProdutoPorNome(escolhaString));
                                System.out.println("Instalado com sucesso");
                                Thread.sleep(1500);
                                break;
                            } else if (sOrN.equalsIgnoreCase("n")) {
                                break;
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Todos os jogos");
                        repositorioProduto.verTodosProdutos();
                        Thread.sleep(4000);
                        break;
                    case 3:
                        System.out.println(user);
                        Thread.sleep(4000);
                        break;
                    case 4:
                        Main.menuInicial();
                        break;
                    case 5:
                        System.out.println("Saindo...");
                        Thread.sleep(2000);
                        System.exit(0);
                }
            } catch (Exception e) {
                Tratamentos.contaInvalida();
            }
        }
    }

}


