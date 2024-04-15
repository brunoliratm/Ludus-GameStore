package GUI;
import java.util.Scanner;
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
        Thread.sleep(1600);

        menuInicial();
    }

    public static void menuInicial() throws InterruptedException {
        System.out.println("\n[1] Cadastrar Usuario");
        System.out.println("[2] Logar");
        System.out.println("[3] Sair\n");

        try {
            System.out.print("--> ");
            int opcao = sc.nextInt();
            Limpeza.limpar();
            switch (opcao) {
                case 1:
                    RegistroUsuario.cadastrarUsuario();
                    break;
                case 2:
                    LoginUsuario.loginUsuario();
                    break;
                case 3:
                    System.out.println("Obrigado por usar nosso aplicativo ;)");
                    Thread.sleep(1500);
                    System.out.println("Saindo...");
                    Thread.sleep(1500);
                    System.exit(0);
                    break;
                default:
                    sc.nextLine();
                    Tratamentos.opcaoInvalida();
                    Limpeza.limpar();
                    menuInicial();
                    break;
            }

        } catch (Exception e) {
            sc.nextLine();
            Tratamentos.valorInvalido();
            Limpeza.limpar();
            menuInicial();
        }
    }
}