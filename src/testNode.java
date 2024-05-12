public class testNode {
    public static void main(String[] args) {
        var three = new NodeThree(20);
        three.addNode(14);
        three.addNode(11);
        three.addNode(5);
        three.addNode(8);
        three.addNode(16);
        three.addNode(15);
        three.addNode(18);
        three.addNode(23);
        three.addNode(22);
        three.addNode(27);
        three.addNode(24);
        three.addNode(150);

        three.printValues();
    }
}
