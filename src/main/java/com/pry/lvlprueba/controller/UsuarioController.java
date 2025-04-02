package com.pry.lvlprueba.controller;
import com.pry.lvlprueba.model.Usuario;
import com.pry.lvlprueba.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UsuarioController {

    @Autowired
    private  UsuarioService usuarioService;

   @GetMapping
    public List<Usuario> listar() {
       return  usuarioService.listarUsuarios();
    }

    @PostMapping("/crear")
    public Usuario guardar(@RequestBody Usuario usuario) {
        return usuarioService.createUsuario(usuario);
    }

    @PutMapping("/{id}")
    public Usuario actualizar(@PathVariable Integer id, @RequestBody Usuario usuario) {
        return usuarioService.updateUsuario(id, usuario);
    }

}
