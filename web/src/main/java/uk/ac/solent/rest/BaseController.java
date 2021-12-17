package uk.ac.solent.rest;

import java.util.List;
import java.util.Optional;

public interface BaseController<T> {
    T create(T entity);
    T save(Integer id,T entity);

    T findById(Integer id);
    List<T> findAll();

    T deleteById(Integer id);
    T archiveById(Integer id);
}
