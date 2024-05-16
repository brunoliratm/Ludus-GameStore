
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

        boolean loginSuccess = false;

        do {
            System.out.println("Digite seu CPF: ");
            String login = input.nextLine();
            System.out.println("Digite sua senha: ");
            String senha = input.nextLine();

            for (Usuario usuario : RepositorioUsuario.listaADM) {
                if (login.equals(usuario.getCPF()) && senha.equals(usuario.getSenha())){
                    MainAdm.menuAdm(usuario);
                    loginSuccess=true;
                    break;
                }
            }
            for (Usuario usario: RepositorioUsuario.listaUsuarios) {
                if (login.equals(usario.getCPF())&& senha.equals(usario.getSenha())){
                    MainLudus.menuDeJogos(usario);
                    loginSuccess=true;
                    break;
                }
            if(loginSuccess){
                MainLudus.menuDeJogos(usario);
            }else {
                Tratamentos.contaInvalida();
                Main.menuInicial();
            }
            }
        } while (!loginSuccess);

    }

}