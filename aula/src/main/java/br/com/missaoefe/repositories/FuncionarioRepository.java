package br.com.missaoefe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.missaoefe.model.Produto;


public interface FuncionarioRepository extends JpaRepository<Produto,Long>{

}
