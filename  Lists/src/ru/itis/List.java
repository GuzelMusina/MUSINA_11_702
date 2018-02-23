package ru.itis;



/**
 * 13.02.2018
 * List
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public interface List<T> extends Collection<T> {
    T get(int index);
    void add(T object);
    void showAllList();
    void reverseList();
}
