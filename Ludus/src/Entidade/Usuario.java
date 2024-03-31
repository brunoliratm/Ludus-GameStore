package Entidade;

public class Usuario extends Pessoa {
    private String CPF;


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
}
