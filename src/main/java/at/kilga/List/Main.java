package at.kilga.List;

public class Main {
    public static void main(String[] args) {
        finnList list = new finnList();
        // list.addFirst(5);
        // list.addFirst(6);
        // list.addFirst(3);
        // list.printList();
        // list.removeLast();
        // list.removeLast();
        // System.out.println("after remove");
        // list.printList();
        // System.out.println("before add last");
        list.addLast(30);
        list.addLast(60);
        list.addLast(50);
        list.printList();
        System.out.println("remove last:");
        list.removeLast();
        list.printList();
        System.out.println("remove last:");
        list.removeLast();
        list.printList();
    }
}
