package DAO;

import java.util.ArrayList;

public interface DAO<T> {


    boolean save(T t);

    boolean add(T t);

    boolean update(T t);

    boolean delete(T t);

    ArrayList<T> selectAll();

    T findById(String id);

    ArrayList<T> searchByCondition(T condition);
}
