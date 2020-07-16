package br.com.unifacef.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.unifacef.entities.ClienteEntity;
import br.com.unifacef.repositories.ClienteRepository;

@CrossOrigin(origins="*")
@RestController //Classe responsavel por controlar req REST
@RequestMapping("cliente")
public class ClienteController {
@Autowired
	
	ClienteRepository injecao;
	//Injeçao de dependencia 
	//Executamos metodos da classe JpaRepository.
	

	//POST
	@PostMapping
	public ClienteEntity addCliente(@RequestBody ClienteEntity cliente) {
		return injecao.save(cliente);
	}
	
	//GET
	@GetMapping
	public List<ClienteEntity> getCliente() {
		return injecao.findAll();
	}
	
	//PUT
	@PutMapping
	public ClienteEntity upadateCliente(@RequestBody ClienteEntity cliente ) {
		return injecao.save(cliente);
	}
	
	//DELETE
	@DeleteMapping("/{id}")
	public ClienteEntity removeCLiente(@PathVariable Long id) {
		 injecao.deleteById(id);
		 return null;
	}
	
	
	
	
	
	
	
	
	
	
	
}
