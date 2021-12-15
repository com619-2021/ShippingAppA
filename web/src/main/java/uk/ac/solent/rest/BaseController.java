package uk.ac.solent.rest;

import java.util.List;
import java.util.Optional;

public interface BaseController<T> {
    Optional<T> create(T entity);
    Optional<T> save(Integer id,T entity);

    Optional<T> findById(Integer id);
    Optional<List<T>> findAll();

    Optional<T> deleteById(Integer id);
    
    Optional<T> archiveById(Integer id);
}
