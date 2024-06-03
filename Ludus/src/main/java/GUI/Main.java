// *   Faculdade: UNIFACOL
// *   Periodo: 3
// *   Alunos: Bruno Magno e Paulo de Araujo

package GUI;

import java.util.Scanner;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
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
        Thread.sleep(1500);

        EntityManagerFactory emf = null;
        EntityManager em = null;

        int tentativas = 2;
        while (tentativas > 0) {
            try {
                emf = Persistence.createEntityManagerFactory("jpa");
                em = emf.createEntityManager();
                em.getTransaction().begin();
                em.getTransaction().commit();
                break;
            } catch (Exception e) {
                tentativas--;
                System.err.println("Erro ao conectar ao banco de dados. Tentando novamente...");
                Thread.sleep(2000);
            } finally {
                if (em != null) {
                    em.close();
                }
            }
        }
        if (emf != null) {
            System.out.print("Carregando");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(1500);
            menuInicial();
        } else {
            Tratamentos.erroConexao();
            Thread.sleep(2000);
            System.exit(0);
        }

    }

    public static void menuInicial() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Limpeza.limpar();
        System.out.println("Menu Inicial\n");
        System.out.println("[1] Cadastrar Usuario");
        System.out.println("[2] Logar");
        System.out.println("[3] Menu da administracao");
        System.out.println("[4] Sair\n");
        System.out.print("--> ");

        String opcao = sc.nextLine();
        Limpeza.limpar();
        switch (opcao) {
            case "1":
                RegistroUsuario.cadastrarUsuario();
                break;
            case "2":
                LoginUsuario.loginUsuario();
                break;
            case "3":
                loginAdm();
                break;
            case "4":
                System.out.println("Obrigado pela confianca, volte sempre!");
                Thread.sleep(1000);
                System.out.println("Saindo...");
                Thread.sleep(2000);
                System.exit(0);
                break;
            default:
                Tratamentos.opcaoInvalida();
                menuInicial();
        }

    }
    public static void loginAdm() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Limpeza.limpar();
        System.out.println("Entrar como ADM\n");
        System.out.print("login: ");
        String login = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();
        Limpeza.limpar();

        if(login.equals("admin") && senha.equals("admin")){
            System.out.println("Entrando como ADM...\n");
            Thread.sleep(2000);
            MenuAdm.menuAdm();
        } else{
            Tratamentos.opcaoInvalida();
            menuInicial();
        }

    }
}


