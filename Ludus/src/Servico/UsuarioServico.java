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
                        break;
                    case 2:
                        System.out.println("Você vai adicionar novo usuário");
                        RegistroUsuario.cadastrarUsuario();
                        break;
                    case 3:
                        System.out.println("Todos usuários do sistema");
                        RepositorioUsuario.mostrarUser();
                        break;
                    case 4:
                        System.out.println("Excluindo conta");
                        System.out.println("Qual CPF você quer excluir?");
                        String cpfExcluir = input.nextLine();
                        RepositorioUsuario.excluirUsuario(cpfExcluir);
                        break;
                    case 5:
                        System.out.println("Voltando para o MenuADM...");
                        loopUser=1;
                }
            }
        }catch (Exception e ){
            Tratamentos.opcaoInvalida();
        }
    }
}
