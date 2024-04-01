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
            System.out.println("Digite seu CPF: ");
            String login = input.nextLine();
            System.out.println("Digite sua senha: ");
            String senha = input.nextLine();

            for (Usuario usuario : RepositorioUsuario.listaUsuarios) {
                if (usuario.getCPF().equals(login) && usuario.getSenha().equals(senha)) {
                    System.out.println("Login efetuado com sucesso!");
                    return;
                } else {
                    Tratamentos.contaInvalida();
                    loginUsuario();
                }
            }
        } catch (Exception e) {
            Tratamentos.valorInvalido();
            loginUsuario();
        }
    }

    public static void cadastrarUsuario() throws InterruptedException {
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
            }
        }catch (Exception e) {
            input.nextLine();
            Tratamentos.valorInvalido();
            cadastrarUsuario();
        }

    }
}