package ru.itis;

/**
 * 13.02.2018
 * Collection
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public interface Collection<T> extends Iterable<T>{
    void remove(T element);
    boolean contains(T element);
    int size();
}
