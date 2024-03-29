package Entidade;

public class Usuario extends Pessoa {
    private String login;


    public Usuario(String nome, String endereco, String telefone, String email, String idade, String login, String senha) {
        super(nome, endereco, telefone, email, idade, senha);
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
