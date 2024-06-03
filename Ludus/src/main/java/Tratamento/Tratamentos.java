
package Tratamento;

public class Tratamentos {
    public static void erroConexao()throws InterruptedException{
        System.out.println("Erro ao conectar com o banco de dados");
        Thread.sleep(2000);
    }
    public static void contaJaExiste() throws InterruptedException {
        System.out.println("Conta ja existe! tente novamente.");
        Thread.sleep(2000);
    }
    public static void usuarioNaoEncontrado() throws InterruptedException {
        System.out.println("Usuario não encontrado! tente novamente.");
        Thread.sleep(2000);
    }
    public static void contaInvalida() throws InterruptedException {
        System.out.println("Login ou senha incorretos! tente novamente.");
        Thread.sleep(2000);
    }

    public static void opcaoInvalida() throws InterruptedException {
        System.out.println("opção escolhida invalida! insira uma opcao valida.");
        Thread.sleep(2000);
    }

    public static void valorInvalido() throws InterruptedException {
        System.out.println("Valor inserido invalido! insira apenaas o que foi pedido.");
        Thread.sleep(2000);
    }

    public static void cpfInvalido() throws InterruptedException {
        System.out.println("CPF invalido! insira um CPF válido, se lembre de inserir apenas numeros.");
        Thread.sleep(2000);
    }
}
