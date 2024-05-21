package Repositorio;
import java.util.ArrayList;

import Entidade.Adm;
import Entidade.Usuario;

public class RepositorioUsuario {
    public static ArrayList<Usuario> listaUsuarios= new ArrayList<>();




    public static void addUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }
    public static boolean checkUp(String cpf){
        for (Usuario usuario: listaUsuarios){
            if (usuario.getCpf().equals(cpf)){
                return true;
            }
        }
        return false;
    }
    public static Usuario checkUsuario(String cpf, boolean adm){
        if (adm== true) {
            for (Usuario usuario : listaUsuarios) {
                if (usuario.getCpf().equals(cpf)) {
                    System.out.println(usuario);
                    return usuario;
                }
            }
            System.out.println("Não foi encontrado nenhum usuário " + cpf);
            return null;
        }return null;
    }
    public static Usuario entrandoNoSistema(String cpf, String senha){
        for (Usuario usuario: listaUsuarios){
            if (usuario.getCpf().equals(cpf) && usuario.getSenha().equals(senha)){
                return usuario;
            }
        }
        return null;
    }

    public static void mostrarUser(){
        for (Usuario usuario : listaUsuarios) {
            System.out.println(usuario);
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
