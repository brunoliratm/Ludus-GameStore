package Entidade;

public class Usuario extends Pessoa {
    private String CPF;
    private Produto meusJogos;

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

    public Produto getMeusJogos() {
        return meusJogos;
    }

    public void setMeusJogos(Produto meusJogos) {
        this.meusJogos = meusJogos;
    }

    @Override
    public String toString() {
        return "Usuario Sobre você:" +
                "CPF='" + CPF + '\'' +
                ", Meus Jogos=" + meusJogos ;
    }
}
