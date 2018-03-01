package ru.itis;

/**
 * 01.03.2018
 * Collection
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public interface Collection<T>{
    void remove(T element);
    boolean contains(T element);
    int size();
}
