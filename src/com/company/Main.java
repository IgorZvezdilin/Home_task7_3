package com.company;

public class Main {

    public static final int TEST_SIZE = 5;

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        Iterator iterator = new Iterator(list);
        //заполнеие списка
        for (int i = 0; i< TEST_SIZE; i++){
            list.addNode("i am "+i);
        }

        //получение элемента по номеру
        System.out.println(list.getNodeValue(1));
        System.out.println(list.getNodeValue(2));
        System.out.println(list.getNodeValue(3));






    }
}
