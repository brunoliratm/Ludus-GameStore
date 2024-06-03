package GUI;

import Servico.ListaJogos;
import Servico.ListaUsuario;
import Servico.RemoverJogo;
import Servico.RemoverUsuario;
import Tratamento.Limpeza;
import java.time.LocalDate;
import java.util.Scanner;

public class MenuAdm {
    public static void menuAdm() throws InterruptedException {

        Scanner sc = new Scanner(System.in);
            Limpeza.limpar();
            System.out.println("Menu ADM");
            System.out.println("\n");
            System.out.print("Bem-vindo(a) administrador!");
            System.out.println("Data: " + LocalDate.now() + '\n');

            System.out.println("1. Listar Jogos");
            System.out.println("2. Listar Usuários");
            System.out.println("3. Remover Usuário");
            System.out.println("4. Remover Jogo");
            System.out.println("5. Retornar ao menu de Login");
            System.out.println("6. Sair");

            System.out.print("--> ");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    ListaJogos.listarJogos();
                    menuAdm();
                    break;
                case "2":
                    ListaUsuario.listarUsuarios();
                    menuAdm();
                    break;
                case "3":
                    RemoverUsuario.removerUsuario();
                    menuAdm();
                    break;
                case "4":
                    RemoverJogo.removerJogo();
                    menuAdm();
                    break;
                case "5":
                    Main.menuInicial();
                    break;
                case "6":
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }


    }
}
