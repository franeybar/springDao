package com.example.demo.DAO;

import com.example.demo.model.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.List;

public interface BaseDAO <T extends Serializable,E>  {
    public E save(T instance) throws Exception;
    public void delete(T instance) throws Exception;
    public List<T> findAll() throws Exception;
    public T findById(E id) throws Exception;
}
