package at.kilga.List;

public class Node {
    private double value;
    private Node nextNode, pastNode;

    public Node(double val) {
        this.value = val;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
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
