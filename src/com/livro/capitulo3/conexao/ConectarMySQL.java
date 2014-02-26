package com.livro.capitulo3.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectarMySQL {

	public Connection getConnection() {
		Connection con = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/agenda",
					"root", "123456");
			System.out.println("Conectado no Banco de Dados Agenda");
			return con;
		} catch (SQLException e) {
			System.out.println("Erro ao conectar no Banco de Dados. Erro: "
					+ e.getErrorCode());
			return null;
		} 
		/*finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Erro ao fechar a conexão. Erro: "
						+ e.getErrorCode());
			}
		}*/
	}
}
