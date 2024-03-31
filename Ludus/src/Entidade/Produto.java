package Entidade;

public class Produto {
    private String nome;
    private String genero;
    private int anoLancamento;
    private String plataforma;
    private int numeroJogadores;
    private boolean online;
    public Object getNome;

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getNumeroJogadores() {
        return numeroJogadores;
    }

    public void setNumeroJogadores(int numeroJogadores) {
        this.numeroJogadores = numeroJogadores;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

}