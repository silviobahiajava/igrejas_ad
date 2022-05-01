package br.com.missaoefe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.missaoefe.model.Evento;

public interface EventoRepository extends JpaRepository<Evento,Long>{

}
