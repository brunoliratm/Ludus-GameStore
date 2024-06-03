package Servico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import Entidade.Usuario;
import GUI.Main;
import GUI.MenuLudus;
import Tratamento.Limpeza;
import Tratamento.Tratamentos;

import java.util.Scanner;

public class LoginUsuario {

    public static void loginUsuario() throws InterruptedException {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        Limpeza.limpar();
        System.out.println("Login de Usuário\n");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();

        System.out.print("CPF: ");
        String cpf = sc.nextLine().replaceAll("[^0-9]", "");

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        try {
            Usuario usuario = em
                    .createQuery("SELECT u FROM Usuario u WHERE u.cpf = :cpf AND u.senha = :senha", Usuario.class)
                    .setParameter("cpf", cpf)
                    .setParameter("senha", senha)
                    .getSingleResult();

            System.out.println("\nLogin realizado com sucesso!");
            Thread.sleep(2000);
            em.close();
            emf.close();
            MenuLudus.menuLudus(usuario);
        } catch (NoResultException e) {
            Tratamentos.contaInvalida();
            em.close();
            emf.close();
            Main.menuInicial();
        }
    }
}
