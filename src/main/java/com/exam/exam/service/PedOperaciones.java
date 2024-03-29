
package com.exam.exam.service;

import java.util.List;

/**
 *
 * @author admin
 * @param <T>
 */
public interface PedOperaciones<T> {
    T create(T t);
    T update(T t);
    void delete(int id);
    T read(int id);
    List<T> readAll();
}
