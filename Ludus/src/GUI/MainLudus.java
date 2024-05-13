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
        int escolhaInt;
        String escolhaString;
        int loopPrincipal =9;
        try {


            while (loopPrincipal != 0) {
                System.out.println("==== LUDUS GAME-STORE ====\n");
                System.out.println("Bem-vindo(a) "+user.getNome()+"!");
                System.out.println("Data: " + LocalDate.now());
                System.out.println("[1] - Buscar por genero\n" +
                        "[2] - Buscar por nome\n" +
                        "[3] - Ver todos os jogos\n" +
                        "[4] - Ver seus jogos");
                escolhaInt = input.nextInt();
                switch (escolhaInt) {
                    case 1:
                        System.out.println("Qual genero você busca?");
                        escolhaString = input.nextLine();
                        System.out.println();
                        input.nextLine();
                        System.out.println();
                        if (repositorioProduto.verProdutoPorGenero(escolhaString) == true) {
                            System.out.println("Deseja instalar algum jogo?");
                            System.out.println("Se sim qual? Se não digite [1]");
                            String baixarOuNao = input.nextLine();
                            if (baixarOuNao.equalsIgnoreCase("1")) {
                                break;
                            } else {
                                if (repositorioProduto.verProdutoPorNome(baixarOuNao) == null) {
                                    System.out.println("Sentimos muito...");
                                } else {
                                    Download.baixarProdurto();
                                    user.setMeusJogos(repositorioProduto.verProdutoPorNome(baixarOuNao));
                                    System.out.println("Finalizado com sucesso");
                                }

                            }
                        }
                        break;
                    case 2:
                        input.nextLine();
                        System.out.println();
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
                                System.out.println("Finalizado com sucesso");
                            } else if (sOrN.equalsIgnoreCase("n")) {
                                break;
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Todos os jogos");
                        repositorioProduto.verTodosProdutos();
                        break;
                    case 4:
                        System.out.println(user.toString());
                }
            }
        }catch (Exception e){
            Tratamentos.opcaoInvalida();
        }
        input.close();

    }

}


