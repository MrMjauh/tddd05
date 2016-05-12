package com.server.dao;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by rasmus on 2016-05-11.
 */
public interface IDao<T, ID extends Serializable> {

    T findOne(ID id);
    Map<ID, T> findAll();
    boolean add(T t);
    boolean delete(ID id);
}
