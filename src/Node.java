public class Node {
    public Node leftNode;
    public Node rightNode;
    private final int currentValue;

    public Node(int value) {
        currentValue = value;
    }

    public int getValue() {
        return currentValue;
    }
}
