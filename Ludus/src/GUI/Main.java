package GUI;
import java.util.Scanner;
import Tratamento.Limpeza;

public class Main {
    public static void main(String[] args) throws InterruptedException {
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

        menuPrincipal();
    }

    public static void menuPrincipal() {
        System.out.println("[1] Cadastrar Usuario");
        System.out.println("[2] Logar");
        System.out.println("[3] Listar Usuarios");
        System.out.println("[4] Sair");

        try {

        } catch (Exception e) {
            System.out.println("Valor inválido!");
            menuPrincipal();
        }
    }
}


