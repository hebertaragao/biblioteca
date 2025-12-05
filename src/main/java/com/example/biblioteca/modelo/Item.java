package com.example.biblioteca.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_item")
public abstract class Item {
    public abstract class Item {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @NotBlank(message = "Título é obrigatório")
        private String titulo;
        @NotBlank(message = "Autor/Artista é obrigatório")
        private String autor;
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
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public String getCategoria() {
            return categoria;
        }

        public void setCategoria(String categoria) {
            this.categoria =
                    categoria;
        }
    }

}
