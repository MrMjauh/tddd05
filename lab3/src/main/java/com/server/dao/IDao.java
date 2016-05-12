package com.server.dao;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by rasmus on 2016-05-11.
 */
public interface IDao<T, ID extends Serializable> {

    public T findOne(ID id);
    public Map<ID, T> findAll();
    public boolean add(T t);
    public boolean delete(ID id);
}
