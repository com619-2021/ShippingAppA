package uk.ac.solent.rest;

import java.util.List;
import java.util.Optional;

public interface BaseController<T> {
    T save(Integer id,T entity);
    void add(T model);
    T findById(Integer id);
    List<T> findAll();

    void deleteById(Integer id);
    T archiveById(Integer id);
}
