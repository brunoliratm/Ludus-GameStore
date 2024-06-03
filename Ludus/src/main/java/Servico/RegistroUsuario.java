package Servico;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

import Tratamento.Tratamentos;
import Entidade.Usuario;
import GUI.Main;
import GUI.MenuLudus;
import Tratamento.Limpeza;


public class RegistroUsuario {
    

    public static void cadastrarUsuario() throws InterruptedException {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        Limpeza.limpar();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();
        System.out.println("Cadastro de Usuário\n");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine().replaceAll("[^0-9]", "");
        if (cpf.length() != 11) {
            Tratamentos.cpfInvalido();
            Main.menuInicial();
        }
        try {
            @SuppressWarnings("unused")
            Usuario clienteExistente = em.createQuery("SELECT c FROM Usuario c WHERE c.cpf = :cpf", Usuario.class)
                    .setParameter("cpf", cpf)
                    .getSingleResult();
            Tratamentos.contaJaExiste();
            em.close();
            emf.close();
            Main.menuInicial();
        } catch (NoResultException e) {
            // Cliente não encontrado, pode prosseguir com o cadastro
        }

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        String telefone;
        while (true) {
            System.out.print("Telefone (ex: (81)99999 9999): ");
            telefone = sc.nextLine().replaceAll("[^0-9]", "");

            if (telefone.length() != 11) {
                System.out.println("Telefone invalido. o telefone contém 11 dígitos.");
            } else {
                break;
            }
        }
        
        Usuario usuario = new Usuario(nome, senha, cpf, email, telefone);
        System.out.println("Cadastrando...");
        Thread.sleep(1500);
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();
        System.out.println("Cliente cadastrado com sucesso!");
        em.close();
        emf.close();
        Thread.sleep(2000);
        MenuLudus.menuLudus(usuario);

}}
