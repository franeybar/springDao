package com.example.demo.DAO;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Repository
@Transactional
public abstract class BaseDaoHibernate<T extends Serializable,E> extends HibernateDAOSupport implements BaseDAO<T,E> {
    @Override
    public E save(T instance) throws Exception {

        return null;
    }

    @Override
    public void delete(T instance) throws Exception {

    }

    @Override
    public List<T> findAll() throws Exception {
        return null;
    }
}
