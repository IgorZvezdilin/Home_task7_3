package com.company;


public class LinkedList {

    Node firstNode;
    Node currentNode;

    public LinkedList(){
        this.firstNode= new Node();
        currentNode = firstNode;
    }

    public Object getNodeValue(int nodePosition) {
        int currentPosition = 0;
        if(currentNode.getNextNode() != null) {
            currentNode = currentNode.getNextNode();
            if (currentPosition-1 == nodePosition)
                return currentNode.getNextNode().getData();
            currentPosition++;

        }
        return null;
    }


    public void addNode(Object data) {
        Node addedNode = new Node();
        addedNode.setData(data);
        if(currentNode.getNextNode() == null) {
            currentNode.setNextNode(addedNode);
            currentNode = addedNode;
        }

    }


}