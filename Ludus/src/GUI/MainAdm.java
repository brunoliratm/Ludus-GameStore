package GUI;

import Entidade.Usuario;
import Tratamento.Tratamentos;

import java.time.LocalDate;

public class MainAdm {
    public static void menuAdm(Usuario ADM) throws InterruptedException {
        System.out.println("Menu ADM");
        System.out.println("==== LUDUS GAME-STORE ====\n");
        System.out.print("Bem-vindo(a) "+ADM.getNome()+"!");
        System.out.println("Data: " + LocalDate.now());
        try {
            System.out.println("[1] - Menu dos jogos\n"+
                    "[2] - Menu dos usuários\n"+
                    "[3] - Sair");
        } catch (Exception e) {
            Tratamentos.opcaoInvalida();
        }
    }
}
