package ru.itis;

/**
 * 15.03.2018
 * HashMap
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class HashMap<K, V> {

    private final int COUNT = 10;
    private Node<K, V> nodes[];

    public HashMap() {
        nodes = new Node[COUNT];
    }

    public void put(K key, V value) {
        int position = getPosition(key);
        Node<K, V> node = new Node<>(key, value);
        if (nodes[position] != null) {
            node.setNext(nodes[position]);
        }
        nodes[position] = node;
    }

    public V get(K key) {
        int position = getPosition(key);
        if (key.equals(nodes[position].getKey())) {
            return nodes[position].getValue();
        }else{
            Node<K,V> current = nodes[position];
            while (current!=null){
                if(key.equals(current.getKey())){
                    return current.getValue();
                }
                current = current.getNext();
            }
        }return null;
    }

    public int getPosition(K key) {
        return key.hashCode() % COUNT;
    }
}
