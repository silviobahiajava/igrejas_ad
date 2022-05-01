package br.com.missaoefe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.missaoefe.model.Documentacao;
import br.com.missaoefe.model.Membro;

public interface DocumentacaoRepository extends JpaRepository<Documentacao,Long>{
	Iterable<Documentacao> findByMembro(Membro membro);
	Documentacao findByRg(String rg);
}
