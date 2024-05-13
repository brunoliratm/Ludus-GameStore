
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
            Usuario u1 = new Usuario("","","","","","","");
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
                        u1=usuario;
                        break;
                    }

                }
                if (loginSuccess) {
                    MainLudus.menuDeJogos(u1);

                    //Main.menuInicial();
                } else {
                    Tratamentos.contaInvalida();
                    Main.menuInicial();
                }
            } while (!loginSuccess);
        
    }

        public static void cadastrarUsuario() throws InterruptedException {
        System.out.println("Cadastro de Usuário\n");
        Limpeza.limpar();
        try {
            System.out.println("Digite seu CPF (apenas o número, sem pontuação): ");
            String cpf = input.nextLine();
            cpf = cpf.replaceAll("[^0-9]", "");
            if (cpf.length() != 11) {
                Tratamentos.cpfInvalido();
                cadastrarUsuario();
            } else {
                System.out.println("Digite seu nome: ");
                String nome = input.nextLine();
                System.out.println("Digite sua senha: ");
                String senha = input.nextLine();
                System.out.println("Digite seu email: ");
                String email = input.nextLine();
                System.out.println("Digite seu telefone: ");
                String telefone = input.nextLine();
                System.out.println("Digite seu endereço: ");
                String endereco = input.nextLine();
                System.out.println("Digite sua idade: ");
                String idade = input.nextLine();

                Usuario usuario = new Usuario(cpf, nome, endereco, telefone, email, idade, senha);
                Thread.sleep(1000);
                RepositorioUsuario.addUsuario(usuario);
                System.out.println("Usuário cadastrado com sucesso!");
                Thread.sleep(2000);
                Main.menuInicial();
            }
        }catch (Exception e) {
            input.nextLine();
            Tratamentos.valorInvalido();
            cadastrarUsuario();
        }

    }
}