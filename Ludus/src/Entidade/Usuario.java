package Entidade;

import java.util.ArrayList;

public class Usuario extends Pessoa {

    private String telefone;
    private String email;
    private ArrayList<Produto> meusJogos = new ArrayList<>();

    public Usuario(String nome, String senha, String cpf, String email, String telefone) {
        super(nome, senha, cpf);
        this.telefone = telefone;
        this.email = email;


    }


    public String getTelefone() {
        return telefone;
    }


    public String getEmail() {
        return email;
    }

    public ArrayList<Produto> getMeusJogos() {
        return meusJogos;
    }

    public void setMeusJogos(Produto jogo) {
        meusJogos.add(jogo);
    }

    @Override
    public String getCpf() {
        return super.getCpf();
    }

    @Override
    public String toString() {
        return "Usuario Sobre você:" +
                "CPF='" + getCpf()  +
                "  "+getNome()+
                "\nTelefone: "+ getTelefone()+
                "\nEmail: "+getEmail()+
                ",\nMeus Jogos="  + getMeusJogos();


    }


}
