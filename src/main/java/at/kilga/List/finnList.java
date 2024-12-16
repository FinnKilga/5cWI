package at.kilga.List;

import at.kilga.List.Node;

public class finnList {
    Node first = null;

    public void add(int value) {
        Node node = new Node(value);
        if (this.first == null) {
            this.first = node;
        } else {
            node.setNextNode(first);
            this.first = node;
        }
    }

    public void removeFirst() {
        if (this.first == null) {
            System.out.println("No elements in list");
        } else {
            Node node = this.first.getNextNode();
            this.first = node;
        }
    }

    public void removeLast() {
        if (this.first == null) {
            System.out.println("No elements in list");
        } else {

        }
    }

    public void printList() {
        Node node;
        if (this.first == null) {
            System.out.println("No elements in list");
        } else {
            node = this.first;
            while (node.nextNode != null) {
                System.out.println(node.getValue());
                node = node.getNextNode();
                if (node.nextNode == null) {
                    System.out.println(node.getValue());
                }
            }
        }
    }
}
