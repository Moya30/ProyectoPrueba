package com.pry.lvlprueba.service.impl;


import com.pry.lvlprueba.model.Usuario;
import com.pry.lvlprueba.repository.UsuarioRepository;
import com.pry.lvlprueba.service.UsuarioService;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;



@Service

public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private  UsuarioRepository usuarioRepository;




    @Override
    @Transactional(readOnly = true)
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> getUsuarioById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Usuario createUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario updateUsuario(Integer id, Usuario usuario) {

        Usuario usuariovalidar = usuarioRepository.findById(id).get();
        if (Objects.nonNull(usuario.getNombUsuario()) && !"".equalsIgnoreCase(usuario.getNombUsuario())) {
            usuariovalidar.setNombUsuario(usuario.getNombUsuario());
        }
        if (Objects.nonNull(usuario.getApeUsuario()) && !"".equalsIgnoreCase(usuario.getApeUsuario())) {
            usuariovalidar.setApeUsuario(usuario.getApeUsuario());
        }
        if (Objects.nonNull(usuario.getNombEmp()) && !"".equalsIgnoreCase(usuario.getNombEmp())) {
            usuariovalidar.setNombEmp(usuario.getNombEmp());
        }
        if (Objects.nonNull(usuario.getCargEmp()) && !"".equalsIgnoreCase(usuario.getCargEmp())) {
            usuariovalidar.setCargEmp(usuario.getCargEmp());
        }
        if (Objects.nonNull(usuario.getTelfUsua()) && !"".equalsIgnoreCase(usuario.getTelfUsua())) {
            usuariovalidar.setTelfUsua(usuario.getTelfUsua());
        }
        if (Objects.nonNull(usuario.getCorreoUsua()) && !"".equalsIgnoreCase(usuario.getCorreoUsua())) {
            usuariovalidar.setCorreoUsua(usuario.getCorreoUsua());
        }
        if (Objects.nonNull(usuario.getPassword()) && !"".equalsIgnoreCase(usuario.getPassword())) {
            usuariovalidar.setPassword(usuario.getPassword());
        }
        return usuarioRepository.save(usuariovalidar);
    }

    @Override
    public void deleteUsuario(Integer id) {

    }
}
