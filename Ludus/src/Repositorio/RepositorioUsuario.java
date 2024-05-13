package Repositorio;
import java.util.ArrayList;

import Entidade.Produto;
import Entidade.Usuario;

public class RepositorioUsuario {
    public static ArrayList<Usuario> listaUsuarios= new ArrayList<>();
    public ArrayList<Produto> listaMeusJogos = new ArrayList<>();


public static void cadastro(){
    listaUsuarios.add(new Usuario("12345678911","a","a","a","a","a","a"));
}

    public static  void addUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
    }

    public boolean checkUsuario(String cpf, String senha){
        
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getCPF().equals(cpf) && usuario.getSenha().equals(senha)) {
                boolean acesso = true;
                return acesso;
    
            }
        }
        return false;
    }
    public static void mostrarUser(){
        for (Usuario usuario : listaUsuarios) {
            System.out.println(usuario.getCPF());
        }
    }
    public void adicionarJogo(Produto p1){
    this.listaMeusJogos.add(p1);
    }
    public void mostrarJogo(){
    if(listaMeusJogos.isEmpty()){
        System.out.println("Lista vazia, baixe um jogo para ver aqui");
    }else {
        System.out.println("Seus jogos");
        System.out.println(listaMeusJogos);
    }
    }
}
