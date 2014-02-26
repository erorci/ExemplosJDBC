package com.livro.capitulo3.crudjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.livro.capitulo3.conexao.ConectarMySQL;

public class ContatoCrudJDBC {
	
	Connection con = null;
	
	public ContatoCrudJDBC() {
		this.con = new ConectarMySQL().getConnection();
	}

	public void salvar(Contato contato) {

		PreparedStatement insereSt = null;
		
		String sql = "INSERT INTO contato" +
				"(nome, telefone, email, dt_cad, obs) VALUES" +
				"(?,?,?,?,?)";
		
		try {
			insereSt = con.prepareStatement(sql);
			insereSt.setString(1, contato.getNome());
			insereSt.setString(2, contato.getTelefone());
			insereSt.setString(3, contato.getEmail());
			insereSt.setDate(4, contato.getDataCadastro());
			insereSt.setString(5, contato.getObservacao());
			insereSt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Erro ao incluir um contato. Erro:  " + e.getErrorCode());
		} finally {
			try {
				insereSt.close();
				con.close();
			} catch (Throwable e) {
				System.out.println("Erro ao Fechar operações de inserção. Erro: " + e.getMessage());
			}
		}
		
		
	}
	
}
