package com.company;

public class Iterator {

    Node currentNode;

    public boolean hasNext(){
        return (currentNode.getNextNode() != null);
    }

    public Object getNextValue(){
        return currentNode.getNextNode().getData();
    }
}
