package com.example.biblioteca.servico;

import com.example.biblioteca.modelo.Item;
import com.example.biblioteca.repositorio.ItemRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class ItemService {
    @Autowired
    private ItemRepository repository;

    public Item adicionar(@Valid Item item) {
        return repository.save(item);
    }

    public List<Item> listarTodos() {
        return repository.findAll();
    }

    public List<Item> listarPorCategoria(String categoria) {
        return repository.findByCategoria(categoria);
    }

    public Item atualizar(Long id, @Valid Item itemAtualizado) {
        Item item = repository.findById(id).orElseThrow(() -> new
                RuntimeException("Item não encontrado"));
        item.setTitulo(itemAtualizado.getTitulo());
        item.setAutor(itemAtualizado.getAutor());
        item.setCategoria(itemAtualizado.getCategoria());
        return repository.save(item);
    }

    public void remover(Long id) {
        repository.deleteById(id);
    }
}