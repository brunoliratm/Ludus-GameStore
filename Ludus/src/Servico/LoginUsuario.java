
package Servico;
import Entidade.Adm;
import Entidade.Usuario;
import Repositorio.RepositorioProduto;
import Repositorio.RepositorioUsuario;
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

//            for (Adm adm : RepositorioUsuario.listaADM) {
//                if (login.equals(adm.getCpf()) && senha.equals(adm.getSenha())){
//                    MainAdm.menuAdm(adm);
//                    loginSuccess=true;
//                    break;
//                }
//            }
//            for (Usuario usario: RepositorioUsuario.listaUsuarios) {
//                if (login.equals(usario.getCpf())&& senha.equals(usario.getSenha())){
//                    MainLudus.menuDeJogos(usario);
//                    u1=usario;
//                    loginSuccess=true;
//                    break;
//                }
//
//            }
            /////////Encontrar e retornar o usuario para entrar na conta
            if (UsuarioServico.verificacaoNoSistema(login, senha) != null){
                MainLudus.menuDeJogos(UsuarioServico.verificacaoNoSistema(login, senha));
                loginSuccess=true;
            } else if (AdmServico.verificacaoNoSistema(login, senha)!=null) {
                MainAdm.menuAdm(AdmServico.verificacaoNoSistema(login, senha));
                loginSuccess=true;
            }

            if(!loginSuccess) {
                Tratamentos.contaInvalida();
                Main.menuInicial();
            }
        } while (!loginSuccess);

    }

}