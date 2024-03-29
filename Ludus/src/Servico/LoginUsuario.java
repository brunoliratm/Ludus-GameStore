package Servico;
import Entidade.Usuario;
import Repositorio.RepositorioUsuario;
import java.util.Scanner;
import Tratamento.*;


public class LoginUsuario {
    static Scanner input = new Scanner(System.in);
public static void loginUsuario() throws InterruptedException {
        Limpeza.limpar();
        try {
            System.out.println("Digite seu login: ");
            String login = input.nextLine();
            System.out.println("Digite sua senha: ");
            String senha = input.nextLine();

            for (Usuario usuario : RepositorioUsuario.listaUsuarios) {
                if (usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)) {
                    System.out.println("Login efetuado com sucesso!");
                    return;
                } else {
                    Tratamentos.contaInvalida();
                    loginUsuario();
                }
            }
        }catch (Exception e){
            Tratamentos.valorInvalido();
            loginUsuario();
        }
    }
}
