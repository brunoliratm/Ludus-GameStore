package Servico;

import Entidade.Compra;
import Entidade.Jogos;
import Entidade.Usuario;
import Tratamento.Limpeza;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class BuscarJogoPorNome {

  public static void buscarEComprarJogo(Usuario usuario) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    Limpeza.limpar();

    System.out.print("Digite o nome do jogo: ");
    String nomeJogo = sc.nextLine();

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
    EntityManager em = emf.createEntityManager();

    try {
      List<Jogos> jogosEncontrados = em.createQuery("SELECT j FROM Jogos j WHERE j.nome LIKE :nome", Jogos.class)
          .setParameter("nome", "%" + nomeJogo + "%")
          .getResultList();

      if (jogosEncontrados.isEmpty()) {
        System.out.println("Nenhum jogo encontrado com esse nome.");
        return;
      }

      System.out.println("\nJogos encontrados:");
      for (int i = 0; i < jogosEncontrados.size(); i++) {
        System.out.println((i + 1) + ". " + jogosEncontrados.get(i));
      }

      System.out.print("\nDigite o número do jogo que deseja comprar (ou 0 para cancelar): ");
      int escolha = sc.nextInt();
      sc.nextLine();

      if (escolha > 0 && escolha <= jogosEncontrados.size()) {
        Jogos jogoEscolhido = jogosEncontrados.get(escolha - 1);

        System.out.print("\nDeseja comprar este jogo? (S/N): ");
        String comprar = sc.nextLine().toUpperCase();
        if (comprar.equals("S")) {
          Compra novaCompra = new Compra(usuario, jogoEscolhido, LocalDate.now());

          em.getTransaction().begin();
          em.persist(novaCompra);
          em.getTransaction().commit();

          System.out.println("GG! Sua compra foi concluída com sucesso");
        }
      } else if (escolha != 0) {
        System.out.println("Opção inválida.");
      }
    } finally {
      em.close();
      emf.close();
    }
  }
}
