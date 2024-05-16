package GUI;

import Entidade.Usuario;
import Servico.UsuarioServico;
import Tratamento.Tratamentos;

import java.time.LocalDate;
import java.util.Scanner;

public class MainAdm {
    public static void menuAdm(Usuario ADM) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int loop = 0;
        while (loop == 0) {
            System.out.println("Menu ADM");
            System.out.println("==== LUDUS GAME-STORE ====\n");
            System.out.print("Bem-vindo(a) " + ADM.getNome() + "!");
            System.out.println("Data: " + LocalDate.now());

            try {
                System.out.println("[1] - Menu dos jogos\n" +
                        "[2] - Menu dos usuários\n" +
                        "[3] - Sair\n");
                System.out.println("O que Você quer fazer?");
                int escolha =input.nextInt();
                switch (escolha){
                    case 1:break;
                    case 2:
                        UsuarioServico.menuUsuario();
                        break;
                    case 3:
                        loop=1;
                        break;
                }
            } catch (Exception e) {
                Tratamentos.opcaoInvalida();
            }
        }
    }
}
