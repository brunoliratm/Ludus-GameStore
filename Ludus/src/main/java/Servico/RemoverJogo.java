package Servico;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Entidade.Jogos;

public class RemoverJogo {
  public static void removerJogo() {
    Scanner sc = new Scanner(System.in);
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
    EntityManager em = emf.createEntityManager();
    System.out.print("Digite o ID do jogo a ser removido: ");
    Long idJogo = sc.nextLong();
    try {
      Jogos jogoRemover = em.find(Jogos.class, idJogo);
      if (jogoRemover != null) {
        em.getTransaction().begin();
        em.remove(jogoRemover);
        em.getTransaction().commit();
        System.out.println("Jogo removido com sucesso.");
      } else {
        System.out.println("Jogo não encontrado.");
      }
    } catch (Exception e) {
      System.out.println("Erro ao remover jogo.");
      e.printStackTrace();
    }
    em.close();
    emf.close();
    System.out.println("\nPressione ENTER para retornar ao menu.");
    sc.nextLine();
  }
}
