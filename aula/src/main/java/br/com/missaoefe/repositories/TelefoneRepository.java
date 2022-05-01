package br.com.missaoefe.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.missaoefe.model.Cliente;
import br.com.missaoefe.model.Telefone;

@Repository
@Transactional
public interface TelefoneRepository extends JpaRepository<Telefone,Long>{
	
	Iterable<Telefone>findByCliente(Cliente cliente);
}
