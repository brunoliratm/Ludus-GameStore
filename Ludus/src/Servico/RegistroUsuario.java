package Servico;

import java.util.Scanner;
import Entidade.Usuario;
import GUI.Main;
import GUI.MainLudus;
import Repositorio.RepositorioUsuario;
import Tratamento.Limpeza;
import Tratamento.Tratamentos;

public class RegistroUsuario {
  static Scanner input = new Scanner(System.in);
  
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
            MainLudus.menuDeJogos(usuario);
        }
    }catch (Exception e) {
        input.nextLine();
        Tratamentos.valorInvalido();
        Main.menuInicial();
    }

}
}
