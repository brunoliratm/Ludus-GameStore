package Entidade;

public class Adm extends Pessoa{
    public Adm(String nome, String senha, String cpf) {
        super(nome, senha, cpf);
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
    public String getSenha() {
        return super.getSenha();
    }

    @Override
    public void setSenha(String senha) {
        super.setSenha(senha);
    }

    @Override
    public String getCpf() {
        return super.getCpf();
    }

    @Override
    public String toString() {
        return "CPF: "+getCpf()+"   "+getNome()+'\n'+
                "\nSua senha: "+ getSenha();

    }
}
