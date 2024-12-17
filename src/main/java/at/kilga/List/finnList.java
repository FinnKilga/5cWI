package at.kilga.List;

import at.kilga.List.Node;

public class finnList {
    private Node first, last;
    private int size = 0;

    // add
    public void addFirst(int value) {
        Node node = new Node(value);
        if (listEmpty()) {
            this.first = node;
        } else {
            node.setNextNode(this.first);
            this.first.setPastNode(node);
            this.first = node;
        }
        setLast();
        this.size++;
    }

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (listEmpty()) {
            this.first = newNode;
        } else {
            Node node = this.first;
            while (true) {
                if (node.getNextNode() == null) {
                    // System.out.println(node.getValue());
                    node.setNextNode(newNode);
                    newNode.setPastNode(node);
                    break;
                }
                node = node.getNextNode();

            }
        }
        setLast();
        this.size++;
    }

    // remove
    public void removeFirst() {
        if (listEmpty()) {
            System.out.println("No elements in list");
        } else {
            Node node = this.first.getNextNode();
            this.first = node;
        }
        setLast();
        this.size--;
    }

    public void removeLast() {
        if (listEmpty()) {
            System.out.println("No elements in list");
        }
        if (this.first.getNextNode() == null) {
            this.first = null;
        } else {
            Node node = this.last.getPastNode();
            node.setNextNode(null);
        }
        setLast();
        this.size--;
    }

    public void removeValue(int value) {
        if (listEmpty()) {
            System.out.println("No elements in list");
        } else {
            Node pastNode, presentNode, futureNode;
            boolean nodeFound = false;

            if (this.first.getValue() == value) {
                removeFirst();
            } else if (this.last.getValue() == value) {
                removeLast();
            } else {
                if (this.size >= 3) {
                    pastNode = this.first;
                    presentNode = pastNode.getNextNode();
                    futureNode = presentNode.getNextNode();
                    while (!nodeFound) {
                        // check value
                        if (presentNode.getValue() == value) {
                            // change next and past node
                            pastNode.setNextNode(futureNode);
                            futureNode.setPastNode(pastNode);
                            nodeFound = true;
                        }
                        // switch nodes
                        pastNode = presentNode;
                        presentNode = futureNode;
                        futureNode = futureNode.getNextNode();
                        // if last node is also not the value print
                        if (presentNode.getNextNode() == null) {
                            System.out.println("No such value in List");
                            nodeFound = true;
                        }
                    }
                } else {
                    System.out.println("No such value in List");
                }
            }
        }
        setLast();
    }

    // Abfragen
    private boolean listEmpty() {
        if (this.first == null) {
            return true;
        } else {
            return false;
        }
    }

    private void setLast() {
        if (this.first == null) {
            this.last = null;
        } else {
            Node node = this.first;
            while (true) {
                if (node.getNextNode() == null) {
                    this.last = node;
                    break;
                }
                node = node.getNextNode();
            }
        }
    }

    // Print
    public void printList() {
        Node node;
        if (listEmpty()) {
            System.out.println("No elements in list");
        } else {
            node = this.first;
            if (node.getNextNode() == null) {
                System.out.println(node.getValue());
            }
            while (node.getNextNode() != null) {
                System.out.println(node.getValue());
                node = node.getNextNode();
                if (node.getNextNode() == null) {
                    System.out.println(node.getValue());
                }
            }
        }
    }

    public void getSize() {
        System.out.println(this.size);
    }

}
