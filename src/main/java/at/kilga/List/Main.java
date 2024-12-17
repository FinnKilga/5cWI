package at.kilga.List;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("new Start");
        finnList list = new finnList();
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.printList();
        System.out.println("remove");
        list.removeValue(50);
        list.printList();
    }
}
