package Repositorio;
import java.util.ArrayList;

import Entidade.Produto;
import Entidade.Usuario;

public class RepositorioUsuario {
    public static ArrayList<Usuario> listaUsuarios= new ArrayList<>();

    public static void cadastroADM(){
        listaUsuarios.add(new Usuario("12345678900","ADM","null","null","null","null","ADM"));
}

    public static  void addUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
    }

    public static void checkUsuario(String cpf){
        
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getCPF().equals(cpf)) {
                System.out.println(usuario);

            }else {
                System.out.println("Usuário não encontrado");
            }
        }

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
