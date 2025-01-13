package at.kilga.List;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("new Start");
        finnList list = new finnList();
        list.help();
        list.printList();
        list.addFirst(10);
        list.addFirst(30);
        list.addFirst(40);
        list.addLast(20);
        list.removeFirst();
        list.removeLast();
        list.removeAll();
        list.addLast(20);
        list.addLast(30);
        list.addFirst(100);
        list.removeValue(20);
        list.replace(100, 60);
        list.printList();
        list.getSize();
    }
}
