
public class NodeThree {
    private static Node root;

    public NodeThree() {

    }

    public NodeThree(int value) {
        this();
        if (root == null)
            root = new Node(value);
        else
            addNode(root, value);
    }

    public void addNode(int value) {
        this.addNode(root, value);
    }

    private void addNode(Node currentNode, int value) {
        if (currentNode == null)
            currentNode = new Node(value);
        else if (currentNode.getValue() > value) {
            if (currentNode.leftNode == null)
                currentNode.leftNode = new Node(value);
            else
                addNode(currentNode.leftNode, value);
        }
        else if (currentNode.getValue() < value) {
            if (currentNode.rightNode == null)
                currentNode.rightNode = new Node(value);
            else
                addNode(currentNode.rightNode, value);
        }
    }

    public void printValues() {
        printValues(root);
    }

    private void printValues(Node node) {
        if (node != null) {
            if (node.leftNode != null && node.rightNode != null) {
                printValues(node.leftNode);
                System.out.print(node.getValue() + " ");
                printValues(node.rightNode);
            } else if (node.leftNode != null) {
                printValues(node.leftNode);
                System.out.print(node.getValue() + " ");
            } else if (node.rightNode != null) {
                System.out.print(node.getValue() + " ");
                printValues(node.rightNode);
            } else {
                System.out.print(node.getValue() + " ");
            }
        }
    }
}
