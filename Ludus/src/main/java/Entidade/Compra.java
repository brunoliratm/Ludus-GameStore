package Entidade;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_cpf")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "jogo_id")
    private Jogos jogo;

    private LocalDate dataCompra;


    public Compra() {
    }

    public Compra(Usuario usuario, Jogos jogo, LocalDate dataCompra) {
        this.usuario = usuario;
        this.jogo = jogo;
        this.dataCompra = dataCompra;
    }

    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }

    public Usuario getUsuario() {
      return usuario;
    }

    public void setUsuario(Usuario usuario) {
      this.usuario = usuario;
    }

    public Jogos getJogo() {
      return jogo;
    }

    public void setJogo(Jogos jogo) {
      this.jogo = jogo;
    }

    public LocalDate getDataCompra() {
      return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
      this.dataCompra = dataCompra;
    }

    // Getters e setters para id, usuario, jogo e dataCompra
    // ...
}
