package com.example.biblioteca.repositorio;

import com.example.biblioteca.modelo.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
	List<Item> findByCategoria(String categoria);
}
