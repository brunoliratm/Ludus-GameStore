package GUI;

import Entidade.*;
import Repositorio.*;
import java.time.LocalDate;
import java.util.Scanner;
import Tratamento.Limpeza;
import Tratamento.Tratamentos;

public class MenuLudus {
  public static void menuLudus() throws InterruptedException{
    Limpeza.limpar();
    System.out.println("==== LUDUS GAME-STORE ====\n");
    System.out.println("Bem-vindo(a) "+"!");
    System.out.println("Data: " + LocalDate.now());

    //recomendacoes
    System.out.println("\nAqui estão algumas recomendações de jogos para você: ");
    System.out.println("- Game 1"+" Preço: ");
    System.out.println("- Game 2"+" Preço: ");
    System.out.println("- Game 3"+" Preço: ");

    System.out.println("\nBusque por jogos para adicionar a sua coleção: ");
    System.out.println("(Digite a opção desejada)");
    System.out.println("[1] Buscar por categoria ");
    System.out.println("[2] Buscar por nome");

    Scanner sc = new Scanner(System.in);
    int opcao = sc.nextInt();

    switch (opcao) {
      case 1:
        System.out.println("Digite a categoria desejada: ");
        String categoria = sc.next();
      case 2:
        System.out.println("Digite o nome do jogo desejado: ");
        String nome = sc.next();
      default:
        Tratamentos.opcaoInvalida();
        menuLudus();
    }

    sc.close();
  } 
}
