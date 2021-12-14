package uk.ac.solent.base;

import java.util.List;
import java.util.Optional;

public interface BaseService<T> {
    Optional<T> create(T entity);
    Optional<T> findById(Integer id);
    Optional<List<T>> findAll();
    Optional<T> save(T entity);
}
