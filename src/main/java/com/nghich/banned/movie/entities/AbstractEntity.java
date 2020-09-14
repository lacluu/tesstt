package com.nghich.banned.movie.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class AbstractEntity implements Serializable {

    protected Long id;
    protected int version;
    protected LocalDateTime createdAt;
    protected LocalDateTime modifiedAt;

    protected AbstractEntity() {
        createdAt = LocalDateTime.now();
        modifiedAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var that = (AbstractEntity) o;
        if (!Objects.equals(id, that.id)){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
