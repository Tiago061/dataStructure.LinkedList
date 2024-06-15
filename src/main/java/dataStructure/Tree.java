package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {

    public Node root;

    public static class Node {
        public int value;
        public Node left;
        public Node rigth;

        public Node(int value){
            this.value = value;
        }
        public boolean isLeaf() {
            return (this != null) && (this.left == null) && (this.rigth == null);
        }
    }

    public void insert(int value){
        if(root == null) root = new Node(value);
        else {
            Node newNode = new Node(value);
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while(queue.size() > 0){
                Node currentNode = queue.remove();
                if(currentNode.left == null){
                    currentNode.left = newNode;
                    break;
                }else {
                    queue.add(currentNode.left);
                }
                if(currentNode.rigth == null){
                    currentNode.rigth = newNode;
                    break;
                }else {
                    queue.add(currentNode.rigth);
                }
            }
        }
    }

    public void preOrder(){
        preOrder(root);

    }

    private void preOrder(final Node node) {
        // R E D
        if(node == null) return;
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.rigth);
    }
    public void inOrder(){
        inOrder(root);

    }

    private void inOrder(final Node node) {
        // E R D
        if(node == null) return;
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.rigth);
    }

    public void posOrder(){
        posOrder(root);

    }

    private void posOrder(final Node node) {
        // E D R
        if(node == null) return;
        posOrder(node.left);
        posOrder(node.rigth);
        System.out.println(node.value);
    }

    public void BFS(){
        if(root == null)return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node node = queue.remove();
            if(node.left != null) queue.add(node.left);
            if(node.rigth != null) queue.add(node.rigth);

            System.out.println(node.value);
        }
    }











    public static void main(String[] args) {
        Tree myTree = new Tree();
        myTree.insert(37);
        myTree.insert(11);
        myTree.insert(66);
        myTree.insert(8);
        myTree.insert(17);
        myTree.insert(42);
        myTree.insert(72);

        System.out.println("######################");
        myTree.BFS();
        System.out.println("######################");


//        System.out.println(myTree.root.value);
//        System.out.println(myTree.root.left.value);
//        System.out.println(myTree.root.rigth.value);
//
//        System.out.println(myTree.root.isLeaf());
//        System.out.println(myTree.root.rigth.isLeaf());
    }
}
