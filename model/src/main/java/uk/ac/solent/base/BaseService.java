package uk.ac.solent.base;

import java.util.List;

public interface BaseService<T> {
    T create(T entity);
    T findById(Integer id);
    List<T> findAll();
    T save(T entity);
}
