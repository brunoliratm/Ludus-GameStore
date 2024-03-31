package Tratamento;

public class Tratamentos extends Exception{
    public static void contaInvalida() throws InterruptedException {
        System.out.println("Login ou senha incorretos!");
        Thread.sleep(2000);
    }

    public static void opcaoInvalida() throws InterruptedException {
        System.out.println("opção inválida!");
        Thread.sleep(2000);
    }

    public static void valorInvalido() throws InterruptedException {
        System.out.println("Valor inválido!");
        Thread.sleep(2000);
    }
}
