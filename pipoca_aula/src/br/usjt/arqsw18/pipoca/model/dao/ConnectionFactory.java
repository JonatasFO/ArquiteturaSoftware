package br.usjt.arqsw18.pipoca.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection() throws SQLException{
		String stringConexao = "jdbc:mysql://localhost:3306/filmes_sin3an_bua";
		String usuario = "root";
		String senha = "4linux";
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		return DriverManager.getConnection(stringConexao, usuario, senha);
		
	}

}
