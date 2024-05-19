package Entidade;

public class Produto {
    private String nome;
    private String genero;
    private int anoLancamento;
    private String plataforma;
    private int numeroJogadores;
    private boolean online;


    public Produto(String nome, String genero, int anoLancamento, String plataforma, int numeroJogadores, boolean online) {
        this.nome = nome;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.plataforma = plataforma;
        this.numeroJogadores = numeroJogadores;
        this.online = online;
    }

    public String getNome() {
        return nome;
    }


    public String getOnline() {
        if (online){
            return "Online";
        }else  return "Offline";
    }


    @Override
    public String toString() {
        return "\nJogo: " +
                 nome +" "+
                 genero +" "+
                 anoLancamento +" "+
                 plataforma +" "+
                 "Numero de jogadores: "+numeroJogadores +" "+
                 getOnline();
    }
}