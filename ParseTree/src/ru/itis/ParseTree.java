package ru.itis;

import java.util.ArrayList;

/**
 * 21.05.2018
 * ParseTree
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class ParseTree {

    Node root;
    char[] chars;
    private ArrayList<ArrayList<Character>> levels;

    class Node{
        private char value;
        private Node left;
        private Node right;
        private Node parent;

        public Node() {
        }

        Node(char value) {
            this.value = value;
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
            if (node.value != 0) {
                value = (this.value != 0) && (this.value==node.value);
            } else {
                value = (this.value == 0);
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
    private void insertLeftChild(Node parent, Node child){
        parent.left = child;
        child.parent = parent;
    }

    private void insertRightChild ( Node parent, Node child){
        parent.right = child;
        child.parent = parent;
    }

    public void insert(String s){
        chars = s.toCharArray();
        root = new Node();
        try{
            insert(0,root);
        }catch (NullPointerException e){
            e.printStackTrace();
        }catch (IllegalAccessError e ){
            e.printStackTrace();
        }
    }
    public void insert (int i, Node currentNode){
        if(i>=chars.length)return;
        if(chars[i]=='('){
            insertLeftChild(currentNode, new Node());
            insert(++i, currentNode.left);
        }else if(chars[i] == '+' || chars[i]=='-' || chars[i]=='*' || chars[i]=='/'){
            currentNode.value = chars[i];
            insertRightChild(currentNode, new Node());
            insert(++i, currentNode.right);
        }else if(chars[i]>='0' && chars[i]<='9'){
            currentNode.value = chars[i];
            insert(++i, currentNode.parent);
        }else if(chars[i]==')'){
            if(chars.length-i<=1) return;
        }else {
            throw new IllegalArgumentException(chars[i] + " is illegal character");
        }
    }
    public void printByLevels(){
        levels = new ArrayList<>();
        levels(root, 0);
        for(int i =0; i<levels.size(); i++){
            String stringLevel = "";
            for(int j = 0 ;j<levels.get(i).size();j++){
                stringLevel+= String.valueOf(levels.get(i).get(j)) + " ";
            }
            if(stringLevel!=""){
                System.out.println(stringLevel);
            }
        }

    }

    public void levels(Node node, int level){
        if(node!=null){
            if(!levels.contains(level)){
                levels.add(new ArrayList<Character>());
            }
            levels.get(level).add(node.value);
            level++;
            levels(node.left,level);
            levels(node.right, level);
        }
    }
    public int evaluate(){
       return evaluate(root);
    }
    private int result =0;

    public int evaluate(Node root){
        if(root.value == '+' || root.value=='-' || root.value=='*' || root.value=='/' ){
            int a=0;
            int b=0;

            if(root.left.value>='0' && root.left.value<='9'){
                a = root.left.value - '0';
            }else{
                evaluate(root.left);
            }
            if(root.right.value>='0' && root.right.value<='9'){
                b = root.right.value - '0';
            }else{
                evaluate(root.right);
            }
            if (root.value == '+') {
              result+= a+b;
              return result;
            }
            if (root.value == '-' && (a!=0 || b!=0)) {
                result = a-result;
                return result;
            }
            if (root.value == '*' && a!=0 && b!=0) {
                if(result!=0){
                    result*=a*b;
                }else{
                    result=a*b;
                }
                return result;
            }
            if (root.value == '/' && (a!=0 || b!=0)) {
                if(result!=0){
                    result =a/result;
                }else {
                    result=a/b;
                }
                return result;
            }
        }
        return result;
    }
}
