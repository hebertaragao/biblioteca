package com.example.biblioteca.modelo;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("LIVRO")
public class Livro extends Item {
    private Integer anoPublicacao;

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.
                anoPublicacao = anoPublicacao;
    }
}