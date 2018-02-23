package ru.itis;

/**
 * 23.02.2018
 * List
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
    public interface List<T>  {
        T get(int index);
        void add(T object);
        void showAllList();
         void remove(T edge);
}
