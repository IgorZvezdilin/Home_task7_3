package com.company;

public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.addNode("super");
        list.addNode("super1");
        list.addNode("super2");
while(list.currentNode.getNextNode() !=null) {
    System.out.println(list.currentNode.getData());
}


    }
}
