package com.pry.lvlprueba.service.impl;

import com.pry.lvlprueba.dto.request.UsuarioRequest;
import com.pry.lvlprueba.model.Usuario;
import com.pry.lvlprueba.repository.UsuarioRepository;
import com.pry.lvlprueba.service.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> getAllUsuarios() {
        return List.of();
    }

    @Override
    public Optional<Usuario> getUsuarioById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Usuario createUsuario(UsuarioRequest usuario) {
        return null;
    }

    @Override
    public Usuario updateUsuario(Integer id, UsuarioRequest usuarioRequest) {
        return null;
    }

    @Override
    public void deleteUsuario(Integer id) {

    }
}
