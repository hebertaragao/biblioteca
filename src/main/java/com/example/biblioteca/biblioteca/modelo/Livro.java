package com.example.biblioteca.biblioteca.modelo;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("LIVRO")
public class Livro {
	
	private Integer anoPublicacao;
	public Integer getAnoPublicacao() {
		return anoPublicacao;
	}
	
	public void setAnoPublicacao(Integer anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
}
