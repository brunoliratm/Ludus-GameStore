package Servico;
import Entidade.Usuario;
import Repositorio.RepositorioUsuario;
import java.util.Scanner;
import Tratamento.*;
import GUI.*;


public class LoginUsuario {
    static Scanner input = new Scanner(System.in);

    public static void loginUsuario() throws InterruptedException {
        System.out.println("Login de Usuário\n");
        Limpeza.limpar();
        try {
            boolean loginSuccess = false;
            do {
                System.out.println("Digite seu CPF: ");
                String login = input.nextLine();
                System.out.println("Digite sua senha: ");
                String senha = input.nextLine();

                for (Usuario usuario : RepositorioUsuario.listaUsuarios) {
                    if (usuario.getCPF().equals(login) && usuario.getSenha().equals(senha)) {
                        System.out.println("Login efetuado com sucesso!");
                        Thread.sleep(2000);
                        loginSuccess = true;
                        break;
                    }
                }
                if (loginSuccess) {
                    MenuLudus.menuLudus();
                } else {
                    Tratamentos.contaInvalida();
                    Main.menuInicial();
                }
            } while (!loginSuccess);
        } catch (Exception e) {
            Tratamentos.valorInvalido();
            loginUsuario();
        }
    }

        
}