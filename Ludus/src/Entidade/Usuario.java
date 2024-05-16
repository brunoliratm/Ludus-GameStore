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
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getEndereco() {
        return super.getEndereco();
    }

    @Override
    public void setEndereco(String endereco) {
        super.setEndereco(endereco);
    }

    @Override
    public String getTelefone() {
        return super.getTelefone();
    }

    @Override
    public void setTelefone(String telefone) {
        super.setTelefone(telefone);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public String getIdade() {
        return super.getIdade();
    }

    @Override
    public void setIdade(String idade) {
        super.setIdade(idade);
    }

    @Override
    public String getSenha() {
        return super.getSenha();
    }

    @Override
    public void setSenha(String senha) {
        super.setSenha(senha);
    }

    @Override
    public String toString() {
        return "Usuario Sobre você:" +
                "CPF='" + CPF  +
                "  "+getNome()+
                "\nEndereço: "+ getEndereco()+
                "\nTelefone: "+ getTelefone()+
                "\nEmail: "+getEmail()+
                "\nIdade: "+getIdade()+
                ",\nMeus Jogos="  + getMeusJogos();


    }


}
