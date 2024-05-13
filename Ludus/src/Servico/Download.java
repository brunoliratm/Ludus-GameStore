package Servico;

import Repositorio.RepositorioProduto;
import Tratamento.Limpeza;

public class Download {

    public static void baixarProdurto(){
        Limpeza.limpar();
        System.out.println("entrou");
        try {
                System.out.println("Instalação iniciada");
                System.out.println("");
                for (int i = 0; i<=10; i++) {
                    System.out.println(i+"0%");
                    Thread.sleep(2000);
                    Limpeza.limpar();
                }


            }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("instalação concluida");
    }
}
