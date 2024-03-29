package Repositorio;
import java.util.ArrayList;
import Entidade.Usuario;

public class RepositorioUsuario {
    public static ArrayList<Usuario> listaUsuarios= new ArrayList<>();

    public static void addUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
    }
}
