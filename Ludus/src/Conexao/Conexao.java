package Conexao;

import Tratamento.Tratamentos;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    public static final String url= "jbdc:mysql://127.0.0.1:3306/ludusbd";
    public static final String user="root";
    public static final String password="Pabj";

    private static Connection connection;

    public static Connection getConnection() throws InterruptedException {
        try{
            if (connection==null){
                 connection = DriverManager.getConnection(url, user, password);
                return connection;
            }else {
                return connection;
            }
        }catch (Exception e){
            Tratamentos.erroConexao();
            return null;
        }
    }
}
