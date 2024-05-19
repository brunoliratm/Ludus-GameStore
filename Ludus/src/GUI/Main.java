package GUI;
import java.util.Scanner;

import Repositorio.RepositorioPessoa;
import Tratamento.Limpeza;
import Tratamento.Tratamentos;
import Servico.*;

public class Main {

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

        Scanner sc = new Scanner(System.in);
        System.out.println("Menu Inicial\n");
            try {

                sc.reset();
                System.out.println("[1] Cadastrar Usuario");
                System.out.println("[2] Logar");
                System.out.println("[3] Sair\n");

                RepositorioPessoa.cadastroADM();
                int opcao = sc.nextInt();
                Limpeza.limpar();
                switch (opcao) {
                    case 1 :
                        RegistroUsuario.cadastrarUsuario();
                        sc.close();
                        break;
                    case 2 :
                        LoginUsuario.loginUsuario();
                        sc.close();
                        break;
                    case 3:
                        System.out.println("Saindo...");
                        Thread.sleep(2000);
                        System.exit(0);
                        break;
                    default :
                        Tratamentos.opcaoInvalida();
                        menuInicial();
                }

            } catch (Exception e) {
                sc.close();
                Tratamentos.valorInvalido();
                menuInicial();
            }
    }
}
