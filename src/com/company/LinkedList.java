package com.company;


public class LinkedList {

    Node firstNode;
    Node currentNode;
    int size = -1;

    public LinkedList() {
        this.firstNode = new Node();
        currentNode = firstNode;
    }

    public Object getNodeValue(int nodePosition) {
        int currentPosition = 0;
        Iterator iterator = new Iterator(this);
        if (nodePosition > size) {
           throw new IndexOutOfBoundsException("Exception: за границей списка");
        }
        while (currentPosition != nodePosition) {
            currentNode = firstNode.getNextNode();
            firstNode = currentNode;
            if (!iterator.hasNext())
                return null;
            currentPosition++;

        }
        return iterator.getNextValue();
    }


    public Object addNode(Object data) {
        Node addedNode = new Node();
        Iterator iterator = new Iterator(this);
        if (!iterator.hasNext()) {
            currentNode.setNextNode(addedNode);
            addedNode.setData(data);
            currentNode = addedNode;
            size++;
        }
    return currentNode.getData();
    }


}