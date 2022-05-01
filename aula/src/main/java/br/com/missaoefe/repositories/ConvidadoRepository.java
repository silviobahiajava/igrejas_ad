package br.com.missaoefe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.missaoefe.model.Convidado;
import br.com.missaoefe.model.Evento;

public interface ConvidadoRepository extends JpaRepository<Convidado,Long> {
	Iterable<Convidado>findByEvento(Evento evento);
	
}
