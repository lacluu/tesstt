package com.nghich.banned.movie.repositories;

import com.nghich.banned.movie.entities.AbstractEntity;

import java.util.Optional;

public interface BaseRepository<T extends AbstractEntity> {

    void save(T entity);

    void delete(T entity);

    T update(T entity);

    int deleteById(Long entityId);

    Optional<T> findById(Long entityId);

}
