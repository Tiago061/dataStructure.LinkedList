package Main;

import dataStructure.LinkedList;

public class Main {
    public static void main(String[] args){
            LinkedList list = new LinkedList("elemento 1");
            list.append("elemento 2");
            list.append("elemento 3");
            list.prepend("elemento 0");

            list.insert(3, "elemento 2.5");
            list.set(0, "elemento 0.5");
            list.remove(2);
            list.print();

            //System.out.println(list.get(2).data);

            //System.out.println(list.removeFirst().data);
            list.print();

            //list.getTail();
            //list.getHead();
            //list.getLength();
            //list.print();
    }
}
