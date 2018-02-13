package ru.itis;



/**
 * 13.02.2018
 * List
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public interface List extends Collection {
    Object get(int index);
    void addToBegin(Object object);
    void showAllList();
    void reverseList();
}
