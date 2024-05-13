package GUI;
import java.time.LocalDate;
import java.util.Scanner;

import Repositorio.RepositorioUsuario;
import Tratamento.Limpeza;
import Tratamento.Tratamentos;
import Servico.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        
        Limpeza.limpar();

        System.out.print("B");
        Thread.sleep(150);
        System.out.print("e");
        Thread.sleep(150);
        System.out.print("m");
        Thread.sleep(150);
        System.out.print("-");
        Thread.sleep(150);
        System.out.print("v");
        Thread.sleep(150);
        System.out.print("i");
        Thread.sleep(150);
        System.out.print("n");
        Thread.sleep(150);
        System.out.print("d");
        Thread.sleep(150);
        System.out.print("o");
        Thread.sleep(150);
        System.out.print(" ");
        Thread.sleep(150);
        System.out.print("a");
        Thread.sleep(150);
        System.out.print("o");
        Thread.sleep(150);
        System.out.print(" ");
        Thread.sleep(150);
        System.out.print("L");
        Thread.sleep(150);
        System.out.print("u");
        Thread.sleep(150);
        System.out.print("d");
        Thread.sleep(150);
        System.out.print("u");
        Thread.sleep(150);
        System.out.print("s\n");
        Thread.sleep(2000);

        menuInicial();
    }

    public static void menuInicial() throws InterruptedException {

        System.out.println("[1] Cadastrar Usuario");
        System.out.println("[2] Logar");
        System.out.println("[3] Sair\n");

        try {
            RepositorioUsuario.cadastro();
            int opcao = sc.nextInt();
            Limpeza.limpar();
            switch (opcao) {
                case 1:
                    LoginUsuario.cadastrarUsuario();
                    break;
                case 2:
                    LoginUsuario.loginUsuario();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    Tratamentos.opcaoInvalida();
                    menuInicial();
                    break;
            }

        } catch (Exception e) {
            Tratamentos.valorInvalido();
            sc.nextInt();
            System.out.println();
            menuInicial();
        }
    }
}
