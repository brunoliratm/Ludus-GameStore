package Entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jogos {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100)
    private String nome;
    @Column(length = 30)
    private String genero;
    @Column(length = 4)
    private int anoLancamento;
    @Column(length = 30)
    private String plataforma;
    @Column(length = 10)
    private Float preco;

    public Jogos() {
    }

    public Jogos(String nome, String genero, int anoLancamento, String plataforma, Float preco) {
        this.nome = nome;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.plataforma = plataforma;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "ID:" +id+ "\nNome:" + nome + "\ngenero: " + genero + "\nAno Lancamento:" + anoLancamento + "\nPlataforma:" + plataforma + "\nPreco=" + preco + "\n";
    }
}