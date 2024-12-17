package at.kilga.List;

public class Node {
    private int value;
    private Node nextNode, pastNode;

    public Node(int val) {
        this.value = val;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getPastNode() {
        return pastNode;
    }

    public void setPastNode(Node pastNode) {
        this.pastNode = pastNode;
    }

}
