package br.com.missaoefe.daos;

import java.util.List;


import br.com.missaoefe.utils.*;

import br.com.missaoefe.model.TesteData;

public interface TesteDataDao {

    void save(TesteData td );

    void update(TesteData td);

    void delete(Long id);

    TesteData findById(Long id);

    List<TesteData> findAll();
    
    PaginacaoUtil<TesteData> buscaPaginada(int pagina, String direcao);
}
