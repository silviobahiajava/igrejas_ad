package br.com.missaoefe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.missaoefe.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
