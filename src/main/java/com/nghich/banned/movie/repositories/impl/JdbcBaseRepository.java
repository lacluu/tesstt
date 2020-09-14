package com.nghich.banned.movie.repositories.impl;

import com.nghich.banned.movie.entities.AbstractEntity;
import com.nghich.banned.movie.repositories.BaseRepository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Optional;

public class JdbcBaseRepository<T extends AbstractEntity> implements BaseRepository<T> {

    protected JdbcTemplate jdbcTemplate;

    public JdbcBaseRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(T entity) {

    }

    @Override
    public void delete(T entity) {

    }

    @Override
    public T update(T entity) {
        return null;
    }

    @Override
    public int deleteById(Long entityId) {
        return 0;
    }

    @Override
    public Optional<T> findById(Long entityId) {
        return Optional.empty();
    }
}
