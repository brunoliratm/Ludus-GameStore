package Servico;

import java.util.Scanner;

import Entidade.Usuario;
import GUI.Main;
import GUI.MainLudus;
import Repositorio.RepositorioProduto;
import Repositorio.RepositorioUsuario;
import Tratamento.Limpeza;
import Tratamento.Tratamentos;

public class RegistroUsuario {
  static Scanner input = new Scanner(System.in);
  
  public static void cadastrarUsuario() throws InterruptedException {
      Limpeza.limpar();
      RepositorioProduto.jogosAdicionados();
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


                Usuario usuario = new Usuario(nome, senha, cpf, email, telefone);
                if (UsuarioServico.verificacaoNoSistema(cpf) || AdmServico.verificacaoNoSistema(cpf)){
                    System.out.println("Já possui um usuário com esse CPF");
                }else {
                    RepositorioUsuario.addUsuario(usuario);
                    MainLudus.menuDeJogos(usuario);
                }

                //UsuarioDAO.cadastrarUsuario(usuario);


            }

    }catch (Exception e) {
        input.nextLine();
        Tratamentos.valorInvalido();
        Main.menuInicial();
    }
      Main.menuInicial();

}
}
