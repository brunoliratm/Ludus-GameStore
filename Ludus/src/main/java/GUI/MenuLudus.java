package GUI;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Entidade.Jogos;
import Entidade.Usuario;
import Servico.BuscarJogoPorNome;
import Servico.ListaJogos;
import Servico.PerfilCliente;
import Tratamento.Limpeza;
import Tratamento.Tratamentos;

import java.time.LocalDate;
public class MenuLudus {

    public static void menuLudus(Usuario usuario) throws InterruptedException {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        Limpeza.limpar();
        System.out.println("==== LUDUS GAME-STORE ====\n");
        System.out.println("Bem-vindo(a) ao servidor, nobre " + usuario.getNome() + "!");
        System.out.println("Data: " + LocalDate.now());

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();

        try {       
            List<Jogos> recomendacoes = em.createQuery("SELECT j FROM Jogos j ORDER BY RAND()", Jogos.class)
                    .setMaxResults(3)
                    .getResultList();

            System.out.println("\nRecomendações do dia: (Com base no seu histórico)");
            for (Jogos jogo : recomendacoes) {
                System.out.println(jogo.getNome() + " - R$ " + String.format("%.2f", jogo.getPreco()));
            }
        } finally {
            em.close();
            emf.close();
        }

        try {
            List<Jogos> novidades = em.createQuery("SELECT j FROM Jogos j ORDER BY j.anoLancamento DESC", Jogos.class)
                    .setMaxResults(3)
                    .getResultList();

            System.out.println("\nNovidades: (Lançamentos recentes)");
            for (Jogos jogo : novidades) {
                System.out.print(jogo.getNome() + " | ");
            }
        } finally {
            em.close();
            emf.close();
        }

        System.out.println("\nO que deseja fazer?");

        System.out.println("\n[1] - Buscar jogos por nome");
        System.out.println("[2] - Ver todos os jogos");
        System.out.println("[3] - Veja seu perfil e seus jogos");
        System.out.println("[4] - Retornar ao menu de Login");
        System.out.println("[5] - Sair (Rage Quit)\n");

        System.out.print("--> ");
        String opcao = sc.nextLine();
        Limpeza.limpar();
        switch (opcao) {
            case "1":
                BuscarJogoPorNome.buscarEComprarJogo(usuario);
                menuLudus(usuario);
                break;
            case "2":
                ListaJogos.listarJogos();
                menuLudus(usuario);
                break;
            case "3":
                PerfilCliente.exibirPerfil(usuario);
                menuLudus(usuario);
                break;
            case "4":
                Main.menuInicial();
                break;
            case "5":
                System.out.println("Obrigado pela confianca, volte sempre!");
                Thread.sleep(1000);
                System.out.println("Saindo...");
                Thread.sleep(2000);
                System.exit(0);
                break;
            default:
                Tratamentos.opcaoInvalida();
                menuLudus(usuario);
        }



    }
}

