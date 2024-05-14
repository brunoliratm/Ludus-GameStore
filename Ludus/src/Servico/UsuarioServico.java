package Servico;

import Repositorio.RepositorioUsuario;
import Tratamento.Tratamentos;

import java.util.Scanner;

public class UsuarioServico {
    public static void menuUsuario() throws InterruptedException {
        Scanner input = new Scanner(System.in);

        try {
            int loopUser = 0;
            while (loopUser==0) {
                System.out.println("Menu usuário");
                System.out.println("[1] - Checar usuário\n" +
                        "[2] - Adicionar novo usuário\n" +
                        "[3] - Ver todos usuários\n" +
                        "[4] - Excluir conta de usuário\n" +
                        "[5] - Voltar ao Menu do ADM");
                int escolha = input.nextInt();
                switch (escolha) {
                    case 1:
                        input.nextLine();
                        System.out.println();
                        System.out.println("Qual o CPF para fazer checkUp?");
                        String cpfCheck = input.nextLine();
                        RepositorioUsuario.checkUsuario(cpfCheck);
                }
            }
        }catch (Exception e ){
            Tratamentos.opcaoInvalida();
        }
    }
}
