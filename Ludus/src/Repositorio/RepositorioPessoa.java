package Repositorio;
import java.util.ArrayList;

import Entidade.Adm;
import Entidade.Usuario;

public class RepositorioPessoa {
    public static ArrayList<Usuario> listaUsuarios= new ArrayList<>();
    public static ArrayList<Adm> listaADM= new ArrayList<>();

    public static void cadastroADM(){
        listaADM.add(new Adm("12345678900","ADM","ADM"));
}

    public static void addUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public static Usuario checkUsuario(String cpf, String senha){
        
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getCpf().equals(cpf) && usuario.getSenha().equals(senha)) {
                return usuario;
            }else {
                System.out.println("Usuário não encontrado");
                return null;
            }
        }
        return null;
    }
    public static Object checkUsuario(String cpf){
        for (Usuario user:listaUsuarios) {
            if (user.getCpf().equals(cpf)){
                return user;
            }
            return null;
        }
        for (Adm user:listaADM){
            if (user.getCpf().equals(cpf)) {
                return user;
            }
        }
        return null;
    }
    public static void mostrarUser(){
        for (Usuario usuario : listaUsuarios) {
            System.out.println(usuario.getCpf());

        }
    }
    public static void excluirUsuario(String cpfUser){
        for (Usuario user:listaUsuarios) {
            if (user.getCpf().equals(cpfUser)){
                listaUsuarios.remove(user);
                System.out.println("Usuário removido");
            }else {
                System.out.println("Usário não encontrado");
            }
        }
    }

}
