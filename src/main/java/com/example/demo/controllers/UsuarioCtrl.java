package com.example.demo.controllers;

import com.example.demo.model.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioCtrl {

    @RequestMapping(value = "/getUsuario/{id}")
    public Usuario getUsuario(@PathVariable Long id ){
    Usuario usuario = new Usuario("francisco","neyrotte",id);
    return usuario;
    }

    @RequestMapping(value = "/getUsuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<Usuario>();
        return  usuarios;
    }
}
