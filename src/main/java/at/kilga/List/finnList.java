package at.kilga.List;

import at.kilga.List.Node;

public class finnList {
    private Node first, last;
    private int size = 0;

    // add
    public void addFirst(double value) {
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

    public void addLast(double value) {
        Node newNode = new Node(value);
        if (listEmpty()) {
            this.first = newNode;
        } else {
            Node node = this.first;
            while (true) {
                if (node.getNextNode() == null) {
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

    public void removeValue(double value) {
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
                            System.out.println("Value: " + value + " not found");
                            nodeFound = true;
                        }
                    }
                } else {
                    System.out.println("Value: " + value + " not found");
                }
            }
        }
        setLast();
    }

    public void removeAll() {
        if (listEmpty()) {
            System.out.println("No elements in list");
        } else {
            while (this.size != 0) {
                Node node = this.first.getNextNode();
                this.first = node;
                this.size--;
            }
        }
    }

    // replace
    public void replace(double oldValue, double newValue) {
        if (listEmpty()) {
            System.out.println("No elements in list");
        } else {

            if (this.first.getValue() == oldValue) {
                this.first.setValue(newValue);
            } else if (this.last.getValue() == oldValue) {
                this.last.setValue(newValue);
            } else {
                Node node;
                boolean nodeFound = false;
                if (this.size >= 3) {
                    node = this.first.getNextNode();
                    while (!nodeFound) {
                        // check value
                        if (node.getValue() == oldValue) {
                            // change value
                            node.setValue(newValue);
                            nodeFound = true;
                        }
                        // if last node is also not the value print
                        if (node.getNextNode() == null) {
                            System.out.println("Value: " + oldValue + " not found");
                            nodeFound = true;
                        } else {
                            // switch nodes
                            node = node.getNextNode();
                        }
                    }
                } else {
                    System.out.println("Value: " + oldValue + " not found");
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

    public void help() {
        System.out.println("The following actions are available:");
        System.out.println("Add:");
        System.out.println("addFirst() --> puts Object on the first place of the List");
        System.out.println("addLast() --> puts Object on the last place of the List");
        System.out.println("Remove:");
        System.out.println("removeFirst() --> removes Object on the first place");
        System.out.println("removeLast() --> removes Object on the last place");
        System.out.println("removeAll() --> removes all Objects");
        System.out.println("removeValue() --> removes specific Object");
        System.out.println("Replace:");
        System.out.println("replace() --> replaces specific Object");
        System.out.println("Infos:");
        System.out.println("printList() --> prints all Objects");
        System.out.println("getSize() --> prints dize of List");
    }
}