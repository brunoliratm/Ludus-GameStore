package Repositorio;
import java.util.ArrayList;

import Entidade.Produto;
import Entidade.Usuario;

public class RepositorioUsuario {
    public static ArrayList<Usuario> listaUsuarios= new ArrayList<>();
    public static ArrayList<Usuario> listaADM= new ArrayList<>();

    public static void cadastroADM(){
        listaADM.add(new Usuario("12345678900","ADM","null","null","null","null","ADM"));
}

    public static void addUsuario(Usuario usuario) {
        listaADM.add(usuario);
    }

    public static Usuario checkUsuario(String cpf, String senha){
        
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getCPF().equals(cpf) && usuario.getSenha().equals(senha)) {
                return usuario;
            }else {
                System.out.println("Usuário não encontrado");
                return null;
            }
        }
        return null;
    }
    public static Usuario checkUsuario(String cpf){
        for (Usuario user:listaUsuarios) {
            if (user.getCPF().equals(cpf)){
                return user;
            }
            return null;
        }
        for (Usuario user:listaADM){
            if (user.getCPF().equals(cpf)) {
                return user;
            }
        }
        return null;
    }
    public static void mostrarUser(){
        for (Usuario usuario : listaUsuarios) {
            System.out.println(usuario.getCPF());

        }
    }
    public static void excluirUsuario(String cpfUser){
        for (Usuario user:listaUsuarios) {
            if (user.getCPF().equals(cpfUser)){
                listaUsuarios.remove(user);
                System.out.println("Usuário removido");
            }else {
                System.out.println("Usário não encontrado");
            }
        }
    }

}
