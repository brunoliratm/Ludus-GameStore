package Entidade;

import java.io.Serial;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario extends Pessoa {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @Column(length = 11)
    private String cpf;
    
    @Column(length = 100)
    private String email;

    public Usuario() {
    }
    public Usuario(String nome, String senha, String cpf, String email, String telefone) {
        super(nome, senha, telefone);
        this.email = email;
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return super.getCpf();
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Sobre você:" +
                "\nCPF: " + getCpf()  +
                "\nNome: "+getNome()+
                "\nTelefone: "+ getTelefone()+
                "\nEmail: "+getEmail();
    }


}
