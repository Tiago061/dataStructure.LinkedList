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

    public static void main(String[] args) {
        Tree myTree = new Tree();
        myTree.insert(1);
        myTree.insert(2);
        myTree.insert(3);

        System.out.println(myTree.root.value);
        System.out.println(myTree.root.left.value);
        System.out.println(myTree.root.rigth.value);

        System.out.println(myTree.root.isLeaf());
        System.out.println(myTree.root.rigth.isLeaf());
    }
}
