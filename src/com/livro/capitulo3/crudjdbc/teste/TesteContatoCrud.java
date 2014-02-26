package com.livro.capitulo3.crudjdbc.teste;

import com.livro.capitulo3.crudjdbc.Contato;
import com.livro.capitulo3.crudjdbc.ContatoCrudJDBC;

public class TesteContatoCrud {

	public static void main(String[] args) {
		Contato contato = new Contato();
		
		contato.setNome("Emerson R Orci");
		contato.setEmail("erorci@gmail.com");
		contato.setTelefone("19988251445");
		
		ContatoCrudJDBC dao =  new ContatoCrudJDBC();
		dao.salvar(contato);
		
	}
	
}
