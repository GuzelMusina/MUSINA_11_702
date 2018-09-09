package ru.itis.taxi.repositories;

import java.util.List;

/**
 * 05.09.2018
 * CrudRepositories
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public interface CrudRepositories<T, V> {
    void save(T model);
    void update(T model);
    void delete(V id);
    T findOne(V id);
    List<T> findAll();
}