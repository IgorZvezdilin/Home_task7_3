package com.company;

public class Iterator {
    LinkedList list;


    public Iterator(LinkedList list){
        this.list = list;
    }



    public boolean hasNext(){
        return (list.currentNode.getNextNode() != null);
    }



}
