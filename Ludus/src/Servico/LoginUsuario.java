
package Servico;
import Entidade.Adm;
import Entidade.Usuario;
import Repositorio.RepositorioProduto;
import Repositorio.RepositorioPessoa;
import java.util.Scanner;
import Tratamento.*;
import GUI.*;


public class LoginUsuario {
    static Scanner input = new Scanner(System.in);

    public static void loginUsuario() throws InterruptedException {
        Limpeza.limpar();
        Usuario u1 = new Usuario("","","","","");
        RepositorioProduto.jogosAdicionados();
        System.out.println("Login de Usuário\n");
        Limpeza.limpar();

        boolean loginSuccess = false;

        do {
            System.out.println("Digite seu CPF: ");
            String login = input.nextLine();
            System.out.println("Digite sua senha: ");
            String senha = input.nextLine();

            for (Adm adm : RepositorioPessoa.listaADM) {
                if (login.equals(adm.getCpf()) && senha.equals(adm.getSenha())){
                    MainAdm.menuAdm(adm);
                    loginSuccess=true;
                    break;
                }
            }
            for (Usuario usario: RepositorioPessoa.listaUsuarios) {
                if (login.equals(usario.getCpf())&& senha.equals(usario.getSenha())){
                    MainLudus.menuDeJogos(usario);
                    u1=usario;
                    loginSuccess=true;
                    break;
                }

            }

            if(loginSuccess){
                MainLudus.menuDeJogos(u1);
            }else if(!loginSuccess) {
                Tratamentos.contaInvalida();
                Main.menuInicial();
            }
        } while (!loginSuccess);

    }

}