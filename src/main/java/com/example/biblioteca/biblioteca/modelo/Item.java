package com.example.biblioteca.biblioteca.modelo;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_item")
public abstract class Item {
	public abstract class Item{
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotBlank(message = "Título é obrigatório")
		private String titulo;
		
		@NotBlank(message = "Autor/Artista é obrigatório")
		private String titulo;
		
		@NotBlank(message = "Categoria é obrigatória")
		private String categoria;
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getAutor() {
			return autorArtista;
		}
		public void setAutor(String autorArtista) {
			this.autorArtista = autorArtista;
		}
		public String getCategoria() {
			return categoria;
		}
		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}
	}

}
