package ru.itis;

/**
 * 01.03.2018
 * List
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public interface List<T> extends Collection<T> {
    T get(int index);

    void add(T object);

    void showAllList();
}

