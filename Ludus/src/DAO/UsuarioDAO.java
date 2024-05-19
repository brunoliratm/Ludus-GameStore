package DAO;

import Conexao.Conexao;
import Entidade.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {
    public static void cadastrarUsuario(Usuario usuario) throws InterruptedException {
        Connection con =Conexao.getConnection();
        String sql = "INSERT INTO usuario ( nome, senha, cpf, telefone,  email) VALUES (?,?,?,?,?)";

        try (PreparedStatement ps = con.prepareStatement(sql)){

            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            ps.setString(5, usuario.getTelefone());
            ps.setString(6, usuario.getEmail());

            ps.executeUpdate();
            ps.close();
            con.close();
        }catch (Exception e){
            System.out.println("Erro ao cadasatrar");
        }
    }
    public void atualizarUsuario(Usuario usuario) throws InterruptedException {
        Connection con = Conexao.getConnection();
        String sql= "UPDATE usuario SET nome=?,senha=?,cpf=?,telefone=?,email=?, WHERE cpf=?";
        try(PreparedStatement ps =con.prepareStatement(sql)) {
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            ps.setString(3, usuario.getCpf());
            ps.setString(5, usuario.getTelefone());
            ps.setString(6, usuario.getEmail());


            ps.executeUpdate();
            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Erro de ataulizaçao");
        }

    }
    public void excluirUsuario(Usuario usuario){

    }
}
