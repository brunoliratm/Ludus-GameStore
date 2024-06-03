package Servico;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Entidade.Compra;
import Entidade.Usuario;

public class PerfilCliente {

  public static void exibirPerfil(Usuario usuario) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
    EntityManager em = emf.createEntityManager();

    try {
      System.out.println("\n=== Seu Perfil ===");
      System.out.println(usuario);
      List<Compra> compras = em.createQuery("SELECT c FROM compra c WHERE c.usuario.cpf = :cpf", Compra.class)
          .setParameter("cpf", usuario.getCpf())
          .getResultList();

      if (compras.isEmpty()) {
        System.out.println("\nVocê ainda não comprou nenhum jogo.");
      } else {
        System.out.println("\nSeus Jogos:");
        for (Compra compra : compras) {
          System.out.println(compra.getJogo());
        }
      }
    } finally {
      em.close();
      emf.close();
    }
    System.out.println("\nPressione Enter para voltar ao menu principal.");
    sc.nextLine();
  }
}
