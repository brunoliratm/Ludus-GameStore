package Servico;

import Entidade.Jogos;
import GUI.MenuAdm;
import Tratamento.Limpeza;
import Tratamento.Tratamentos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AdicionarJogo {

    public static void adicionarJogo() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Limpeza.limpar();

        System.out.println("Adicionar Novo Jogo");

        System.out.print("Nome do jogo: ");
        String nome = sc.nextLine();
        System.out.print("Gênero: ");
        String genero = sc.nextLine();

        int anoLancamento;
        while (true) {
            try {
                System.out.print("Ano de lançamento: ");
                anoLancamento = sc.nextInt();
                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ano de lancamento invalido. Digite um numero inteiro.");
                sc.nextLine();
            }
        }

        System.out.print("Plataforma: ");
        String plataforma = sc.nextLine();

        float preco;
        while (true) {
            try {
                System.out.print("Preco: ");
                preco = sc.nextFloat();
                sc.nextLine();
                if (preco <= 0) {
                    throw new IllegalArgumentException("Preco deve ser maior que zero.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Preco invalido. Digite um numero decimal (use ponto para separar decimais).");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        Jogos novoJogo = new Jogos(nome, genero, anoLancamento, plataforma, preco);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(novoJogo);
            em.getTransaction().commit();
            System.out.println("Jogo adicionado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao adicionar jogo.");
            Tratamentos.valorInvalido();
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            em.close();
            emf.close();
            MenuAdm.menuAdm();
        }
    }
}