package com.example.biblioteca.aplicacao;

import com.example.biblioteca.modelo.Item;
import com.example.biblioteca.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/itens")
@CrossOrigin(origins = "http://localhost:4200")
public class ItemController {

	@Autowired
	private ItemService service;
	
	@PostMapping
	public Item adicionar(@RequestBody Item item) {
		return service.adicionar(item);
	}
	
	@GetMapping
	public List<Item> listarTodos() {
		return service.listarTodos();
	}
	
	@GetMapping("/categoria/{categoria}")
	public List<Item> listarPorCategoria(@PathVariable String categoria) {
		return service.listarPorCategoria(categoria);
	}
	
	@PutMapping("/{id}")
	public Item atualizar(@PathVariable Long id, @RequestBody Item item) {
		return service.atualizar(id, item);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> remover(@PathVariable Long id) {
		service.remover(id);
		return ResponseEntity.noContent().build();
	}
}
