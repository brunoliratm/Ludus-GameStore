package Servico;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Entidade.Jogos;

public class ListaJogos {

  public static void listarJogos() {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
    EntityManager em = emf.createEntityManager();

    try {
      List<Jogos> todosJogos = em.createQuery("SELECT j FROM Jogos j", Jogos.class)
          .getResultList();

      if (todosJogos.isEmpty()) {
        System.out.println("Nenhum jogo cadastrado.");
      } else {
        System.out.println("\nTodos os Jogos:");
        for (Jogos jogo : todosJogos) {
          System.out.println(jogo); // Exibe as informações de cada jogo
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