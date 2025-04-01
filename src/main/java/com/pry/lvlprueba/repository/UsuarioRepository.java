package com.pry.lvlprueba.repository;

import com.pry.lvlprueba.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
}
