package com.pry.lvlprueba.service;


import com.pry.lvlprueba.dto.request.UsuarioRequest;
import com.pry.lvlprueba.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface  UsuarioService {

     List<Usuario> getAllUsuarios();
     Optional <Usuario> getUsuarioById(Integer id);
     Usuario createUsuario (UsuarioRequest usuario);
     Usuario updateUsuario (Integer id, UsuarioRequest usuarioRequest);
     void deleteUsuario(Integer id);


}
