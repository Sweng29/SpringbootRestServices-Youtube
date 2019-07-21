package com.mantis.tech.utils;

import java.util.List;

public interface GenericDAO<T> {
    public T addOrUpdate(T entity);

    public T getById(Long id);

    public List<T> getAll();

    public boolean deleteById(Long id);
}
