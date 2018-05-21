package ru.itis;

import java.util.ArrayList;
import java.util.Objects;

/**
 * 03.04.2018
 * TreeBstImpl
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class TreeBstImpl<T extends Comparable<T>> implements Tree<T> {
    class Node {
        private T value;
        private Node left;
        private Node right;
        private int height;

        Node(T value, int height) {
            this.value = value;
            this.height = height;
        }

        @Override
        public boolean equals(Object object) {
            Node node = (Node) object;
            if (this == object) {
                return true;
            }
            if (object == null) {
                return false;
            }
            boolean value, left, right;
            if (node.value != null) {
                value = (this.value != null) && (this.value.equals(node.value));
            } else {
                value = (this.value == null);
            }

            if (node.left != null) {
                left = (this.left != null) && (this.left.equals(node.left));
            } else {
                left = (this.left == null);
            }

            if (node.right != null) {
                right = (this.right != null) && (this.right.equals(node.right));
            } else {
                right = (this.right == null);
            }

            return value && right && left;
        }
    }

    public Node getRoot() {
        return root;
    }

    private Node root;
    private int height;

    public TreeBstImpl() {
        this.root = null;
    }

    public void insert(T value) {
        this.root = insert(root, value, (root == null) ? 0 : root.height);

    }

    public void print() {
        print(root);
    }

    private void print(Node root) {
        if (root != null) {
            print(root.left);
            System.out.print(root.value + " ");
            print(root.right);
        }
    }

    private Node insert(Node root, T value, int height) {
        if (root == null) {
            root = new Node(value, height);
        } else if (value.compareTo(root.value) <= 0) {
            root.left = insert(root.left, value, height + 1);
        } else {
            root.right = insert(root.right, value, height + 1);
        }
        this.height = (this.height < root.height) ? root.height : this.height;
        return root;
    }

    public boolean contains(T value) {
        return finderForContains(this.root, value);
    }

    private boolean finderForContains(Node current, T value) {
        if (current != null) {
            if (current.value.equals(value)) {
                return true;
            } else if (current.value.compareTo(value) > 0) {
                return finderForContains(current.left, value);
            } else {
                return finderForContains(current.right, value);
            }
        }
        return false;
    }


    @Override
    public boolean isBst() {
        return isBstHelper(this.root);
    }

    private boolean isBstHelper(Node current) {
        if (current != null) {
            if ((current.left != null && current.value.compareTo(current.left.value) < 0 ||
                    current.right != null && current.value.compareTo(current.right.value) >= 0)) {
                return false;
            } else {
                isBstHelper(current.left);
                isBstHelper(current.right);
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof TreeBstImpl)) {
            return false;
        }
        TreeBstImpl treeBst = (TreeBstImpl) object;
        return this.root.equals(treeBst.root);
    }


    @Override
    public void printByLevels() {
        ArrayList<ArrayList<T>> tree = new ArrayList<>();
        addTreeByLevels(this.root, this.root.height, tree);
        for (int i = 0; i < tree.size(); i++) {
            for (int j = 0; j < tree.get(i).size(); j++)
                if (tree.get(i).get(j) != null)
                    System.out.print(tree.get(i).get(j) + " ");
            System.out.println();
        }
    }

    private void addTreeByLevels(Node root, int height, ArrayList<ArrayList<T>> tree) {
        if (height <= this.height) {
            if (tree.size() <= height)
                tree.add(new ArrayList<>());
            if (root == null) {
                tree.get(height).add(null);
            } else {
                tree.get(height).add(root.value);
                addTreeByLevels(root.left, height + 1, tree);
                addTreeByLevels(root.right, height + 1, tree);
            }
        }

    }

    public boolean remove(T value) {
        Node current, parent;

        //находим удаляемый узел
        parent=findWithParent(null, this.root, value);
        if(parent == null){
            return false;
        }else if(parent.left!= null && parent.left.value.equals(value)){
            current = parent.left;
        }else{
            current = parent.right;
        }
        // Если нет детей справа, левый ребенок встает на место удаляемого.
        if(current.right==null){
            if(parent.left!=null && current.value.equals(parent.left.value)){
                // левый узел становится левым ребенком родителя.
                parent.left = current.left;
            }else {
                // левый узел становится правым ребенком родителя.
                parent.right = current.left;
            }
        }else {
            //Создаем самый крайний правый узел
            Node minRightRoot = current;
            Node node = current.right;
            while (node.left != null){
                minRightRoot = node;
                node = node.left;
            }
            current.value = node.value;
            if(minRightRoot == current){
                current.right = minRightRoot.right.right;
            }else{
                minRightRoot.left=null;
            }
        }
        return true;
    }

    //Находит и возвращает первый узел с заданным значением. Если значение
    // не найдено, возвращает null
    private Node findWithParent (Node parent, Node current , T value){
        if(current!=null){
            //пробуем найти значение в дереве
            if(current.value.equals(value)){
                return parent;
            }else{
                // Если искомое значение больше, идем налево
                if(value.compareTo(current.value)<=0){
                    return findWithParent(current,current.left,value);
                }else {
                    //Если меньше, направо
                    return findWithParent(current,current.right,value);
                }
            }
        }
        return null;
    }
}