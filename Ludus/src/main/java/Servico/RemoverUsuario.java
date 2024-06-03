package Servico;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Entidade.Usuario;
import Tratamento.Tratamentos;

public class RemoverUsuario {
  public static void removerUsuario() {
    Scanner sc = new Scanner(System.in);
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
    EntityManager em = emf.createEntityManager();
    System.out.print("Digite o CPF do usuário a ser removido: ");
    String cpf = sc.nextLine();
    try {
      Usuario usuarioRemover = em.find(Usuario.class, cpf);
      if (usuarioRemover != null) {
        em.getTransaction().begin();
        em.remove(usuarioRemover);
        em.getTransaction().commit();
        System.out.println("Usuário removido com sucesso.");
      } else {
        Tratamentos.usuarioNaoEncontrado();
      }
    } catch (Exception e) {
      System.out.println("Erro ao remover usuário.");
      e.printStackTrace();
    }
    em.close();
    emf.close();
    System.out.println("\nPressione ENTER para retornar ao menu.");
    sc.nextLine();
  }
}
