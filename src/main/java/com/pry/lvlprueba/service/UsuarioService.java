package com.pry.lvlprueba.service;


import com.pry.lvlprueba.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface  UsuarioService {

     List<Usuario> listarUsuarios();

    Optional<Usuario> getUsuarioById(Integer id);

     Usuario  createUsuario(Usuario usuario);

     Usuario updateUsuario(Integer id, Usuario usuario);

     void deleteUsuario(Integer id);

}
