package Entidade;

import java.util.ArrayList;

public class Usuario extends Pessoa {
    private String CPF;
    private Produto jogo;
    private ArrayList<Produto> MeusJogos = new ArrayList<>();

    public Usuario(String CPF, String nome, String endereco, String telefone, String email, String idade, String senha) {
        super(nome, endereco, telefone, email, idade, senha);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setMeusJogos(Produto meusJogos) {
        MeusJogos.add(meusJogos);
    }

    public ArrayList<Produto> getMeusJogos() {
        return MeusJogos;
    }

    @Override
    public String toString() {
        return "Usuario Sobre você:" +
                "CPF='" + CPF  +
                ",\nMeus Jogos="  + getMeusJogos();
    }


}
