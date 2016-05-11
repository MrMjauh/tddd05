package com.example.dao;

import java.io.Serializable;
import java.util.Iterator;

/**
 * Created by rasmus on 2016-05-11.
 */
public interface IDao<T,ID extends Serializable> {

    public T findOne(ID id);
    public Iterator<T> findAll();
    public boolean add(T t);
    public boolean delete(ID id);
}
