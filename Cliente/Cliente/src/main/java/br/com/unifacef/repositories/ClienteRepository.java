package br.com.unifacef.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.unifacef.entities.ClienteEntity;


public interface ClienteRepository extends JpaRepository<ClienteEntity,Long>{
	//Esta classe herda todos o metodos da classe JpaRepository
		//para a classe GameEntity
		//Métodos de Crud - Create, remove, updade,editar kkk
	
}
