package Servico;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Entidade.Usuario;

public class ListaUsuario {
  public static void listarUsuarios() {
    Scanner sc = new Scanner(System.in);
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
    EntityManager em = emf.createEntityManager();
    List<Usuario> usuarios = em.createQuery("SELECT u FROM Usuario u", Usuario.class).getResultList();
    if (usuarios.isEmpty()) {
      System.out.println("Nenhum usuário cadastrado.");
    } else {
      System.out.println("\nLista de Usuários:");
      for (Usuario usuario : usuarios) {
        System.out.println(usuario);
      }
    }
    em.close();
    emf.close();
    System.out.println("\nPressione ENTER para retornar ao menu.");
    sc.nextLine();

  }

}
