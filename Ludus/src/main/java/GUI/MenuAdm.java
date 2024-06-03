package GUI;

import Servico.*;
import Tratamento.Limpeza;
import java.time.LocalDate;
import java.util.Scanner;

public class MenuAdm {
    public static void menuAdm() throws InterruptedException {

        Scanner sc = new Scanner(System.in);
            Limpeza.limpar();
            System.out.println("Bem-vindo(a) administrador!");
            System.out.println("Data: " + LocalDate.now() + '\n');

            System.out.println("1. Listar Jogos");
            System.out.println("2. Listar Usuarios");
            System.out.println("3. Remover Usuario");
            System.out.println("4. Remover Jogo");
            System.out.println("5. Adicionar Jogo");
            System.out.println("6. Retornar ao menu de Login");
            System.out.println("7. Sair\n");

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
                    AdicionarJogo.adicionarJogo();
                case "6":
                    Main.menuInicial();
                    break;
                case "7":
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }


    }
}
