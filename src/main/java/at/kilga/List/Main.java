package at.kilga.List;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("new Start");
        finnList list = new finnList();
        list.getSize();
        list.addLast(252);
        list.addFirst(420);
        list.addLast(360);
        list.printList();
        list.getSize();
        System.out.println("remove");
        list.removeLast();
        list.removeLast();
        list.printList();
        System.out.println("remove last");
        list.removeLast();
        list.printList();
        list.getSize();
    }
}
