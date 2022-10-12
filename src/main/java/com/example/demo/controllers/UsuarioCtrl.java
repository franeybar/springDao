package com.example.demo.controllers;

import com.example.demo.DAO.UsuarioDao;
import com.example.demo.DAO.UsuarioDaoImpl;
import com.example.demo.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioCtrl {


    @Autowired
    UsuarioDaoImpl usuarioDao;

    @RequestMapping(value = "/getUsuario/{id}")
    public Usuario getUsuario(@PathVariable Long id ) throws Exception {
    return usuarioDao.findById(id);
    }

    @RequestMapping(value = "/getUsuarios")
    public List<Usuario> getUsuarios() throws Exception {

        return usuarioDao.findAll();
    }
}
