package com.company;

public class Main {

    public static final int TEST_SIZE = 5;

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        //заполнеие списка
        fillList(list);

        //Вывод объема а экран
        getSize(list);

        //получение элемента по номеру и вывод элемента на экран
        getElement(list);


    }

    private static void getElement(LinkedList list) {
        for(int i =0; i<list.size;i++) {
       System.out.println(list.getNodeValue(i));
        }
    }

    private static void fillList(LinkedList list) {
        for (int i = -1; i < TEST_SIZE; i++) {
            list.addNode("i am " + i);
        }
    }

    private static void getSize(LinkedList list) {
        System.out.println("Обьем листа = " + list.size);
    }
}
