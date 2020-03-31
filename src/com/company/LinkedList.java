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
        Node firstNodeMetod;
        Node currentNodeMetod;
        firstNodeMetod = firstNode;
        currentNodeMetod = currentNode;
        int currentPosition = -1;

        if (nodePosition > size) {
           throw new IndexOutOfBoundsException("Exception: за границей списка");
        }
        while (currentPosition != nodePosition) {
            currentNodeMetod = firstNodeMetod.getNextNode();
            firstNodeMetod = currentNodeMetod;
            if (currentNodeMetod.getNextNode() == null)
                return null;
            currentPosition++;

        }
        return currentNodeMetod.getNextNode().getData();
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