package at.kilga.List;

public class Main {
    public static void main(String[] args) {
        finnList list = new finnList();
        list.printList();
        list.add(5);
        list.add(6);
        list.add(3);
        list.printList();
        list.removeFirst();
        System.out.println("after remove");
        list.printList();
    }
}
