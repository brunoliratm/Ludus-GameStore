package Servico;

import Entidade.Usuario;
import Repositorio.RepositorioUsuario;
import Tratamento.Limpeza;
import Tratamento.Tratamentos;

import java.util.Scanner;

public class UsuarioServico {
    public static void menuUsuario(Scanner input) throws InterruptedException {

        try {
            int loopUser = 0;
            while (loopUser==0) {
                Limpeza.limpar();
                System.out.println("Menu usuário");
                System.out.println("""
                        [1] - Checar usuário
                        [2] - Adicionar novo usuário
                        [3] - Ver todos usuários
                        [4] - Excluir conta de usuário
                        [5] - Voltar ao Menu do ADM""");
                int escolha = input.nextInt();
                switch (escolha) {
                    case 1:
                        input.nextLine();
                        System.out.println();
                        System.out.println("Qual o CPF para fazer checkUp?");
                        String cpfCheck = input.nextLine();
                        RepositorioUsuario.checkUsuario(cpfCheck, true);
                        Thread.sleep(3500);
                        break;
                    case 2:
                        System.out.println("Você vai adicionar novo usuário");
                        RegistroUsuario.cadastrarUsuario();
                        break;
                    case 3:
                        System.out.println("Todos usuários do sistema");
                        RepositorioUsuario.mostrarUser();
                        Thread.sleep(3000);
                        break;
                    case 4:
                        System.out.println("Excluindo conta");
                        System.out.println("Qual CPF você quer excluir?");
                        String cpfExcluir = input.nextLine();
                        RepositorioUsuario.excluirUsuario(cpfExcluir);
                        Thread.sleep(1500);
                        break;
                    case 5:
                        System.out.println("Voltando para o MenuADM...");
                        loopUser=1;
                        break;
                    default:
                        Tratamentos.opcaoInvalida();
                        Thread.sleep(1500);
                }
            }
        }catch (Exception e ){
            Tratamentos.opcaoInvalida();
        }
    }
    public static boolean verificacaoNoSistema(String cpf){
        return RepositorioUsuario.checkUp(cpf);

    }
    public static Usuario verificacaoNoSistema(String cpf, String senha){
        return RepositorioUsuario.entrandoNoSistema(cpf, senha);
    }
}
