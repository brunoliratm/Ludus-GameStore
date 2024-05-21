package GUI;

import Entidade.Adm;

import Servico.ProdutoServico;
import Servico.UsuarioServico;
import Tratamento.Limpeza;
import Tratamento.Tratamentos;

import java.time.LocalDate;
import java.util.Scanner;

public class MainAdm {
    public static void menuAdm(Adm ADM) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        int loop = 0;
        while (loop == 0) {
            Limpeza.limpar();
            System.out.println("Menu ADM");
            System.out.println("==== LUDUS GAME-STORE ====\n");
            System.out.print("Bem-vindo(a) " + ADM.getNome() + "!  ");
            System.out.println("Data: " + LocalDate.now());

            try {
                System.out.println("[1] - Menu dos jogos\n" +
                        "[2] - Menu dos usuários\n" +
                        "[3] - Sobre você\n" +
                        "[4] - Sair\n");
                System.out.println("O que Você quer fazer?");
                int escolha =input.nextInt();
                switch (escolha){
                    case 1:
                        ProdutoServico.menuProduto(input);
                        break;
                    case 2:
                        UsuarioServico.menuUsuario(input);
                        break;
                    case 3:
                        System.out.println(ADM);
                        Thread.sleep(3000);
                        break;
                    case 4:
                        loop=1;
                        break;
                }
            } catch (Exception e) {
                Tratamentos.opcaoInvalida();
            }
        }
    }
}
