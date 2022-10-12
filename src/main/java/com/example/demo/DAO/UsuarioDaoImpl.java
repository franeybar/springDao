package com.example.demo.DAO;

import com.example.demo.model.Usuario;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImpl implements UsuarioDao{
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public Long save(Usuario instance) throws Exception {

        return null;
    }

    @Override
    public void delete(Usuario instance) throws Exception {

    }

    @Override
    public List<Usuario> findAll() throws Exception {
        //return entityManager.createQuery("from Usuario",Usuario.class).getResultList();

    }

    @Override
    public Usuario findById(Long id) throws Exception {
        return entityManager.find(Usuario.class,id);
    }
}
