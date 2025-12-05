package com.example.biblioteca.modelo;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ALBUM")
public class AlbumMusica extends Item {
	
	private Integer numeroFaixas;
	
	public Integer getNumeroFaixas() {
		return numeroFaixas;
	}
	
	public void setNumeroFaixas(Integer numeroFaixas) {
		this.numeroFaixas = numeroFaixas;
	}

}
