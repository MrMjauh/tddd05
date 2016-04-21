package com.lab2.dao;

/**
 * Created by rasmus on 4/21/16.
 */
public interface BaseDao<T,E> {

    public E update(T t,int pk);
    public E get(int pk);
    public E add(T t);
    public Boolean del(int pk);
}
