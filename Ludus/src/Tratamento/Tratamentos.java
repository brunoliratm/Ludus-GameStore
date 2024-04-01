package Tratamento;

public class Tratamentos {
    public static void contaInvalida() throws InterruptedException {
        System.out.println("Login ou senha incorretos! tente novamente.");
        Thread.sleep(2000);
    }

    public static void opcaoInvalida() throws InterruptedException {
        System.out.println("opção escolhida inválida! insira uma opção válida.");
        Thread.sleep(2000);
    }

    public static void valorInvalido() throws InterruptedException {
        System.out.println("Valor inserido inválido! insira apenaas o que é pedido.");
        Thread.sleep(2000);
    }

    public static void cpfInvalido() throws InterruptedException {
        System.out.println("CPF inválido! insira um CPF válido, se lembre de inserir apenas números.");
        Thread.sleep(2000);
    }
}
