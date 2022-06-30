/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.MCadastroPessoa.connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author eae
 */
public class Conexao {

    //cria uma constante com endereço do BD e schema
    private static String url = "jdbc:mysql://localhost:3306/devm211";
    //cria uma constante com o username
    private static String user = "root";
    //cria uma constante com a senha
    private static String pass = "";

    public static Connection getConnection() throws SQLException {
        //inicia conexão nula, ainda não estabelecida
        Connection c = null;
        //tenta estabelecer conexão
        try {
            c = DriverManager.getConnection(url, user, pass);
            //caso haja falha na conexão, uma exceção é gerada
        } catch (SQLException e) {
            throw new SQLException("Erro ao conectar.\n" + e.getMessage());
        }
        return c;
    }
}
