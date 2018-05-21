package ru.itis.sources;

/**
 * 02.05.2018
 * List
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public interface List<T> extends Collection<T> {
    Node get(int index);

    void add(int x, int y , T value);

    void showAllList();
}

