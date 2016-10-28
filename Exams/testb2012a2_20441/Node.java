    public class Node { 
        private int _data;
        private Node _leftChild; 
        private Node _rightChild; 
        public Node (int data, Node left, Node right) {
            _data = data; _leftChild = left; _rightChild = right; 
        }
        public int getData() {return _data;} 
        public Node getLeftChild() {
            return _leftChild;
        } 
        public Node getRightChild() {
            return _rightChild;
        } 
        public static void printTreePostOrder (Node current) {
        if (current.getLeftChild() != null)
        printTreePostOrder(current.getLeftChild());
        if (current.getRightChild() != null) 
        printTreePostOrder(current.getRightChild());
        System.out.print(current.getData() + "|"); 
        }
        
        public static void printTreeInOrder (Node current) {
            if (current.getLeftChild() != null)
            printTreeInOrder(current.getLeftChild());
            System.out.print(current.getData() + "|");
            if (current.getRightChild() != null) 
            printTreeInOrder(current.getRightChild()); 
        }
        
        public static void main(String[] args) {
            Node n4 = new Node(4, null, null);
            Node n3 = new Node(3, null, null);
            Node n11 = new Node(11, null, null);
            Node n10 = new Node(10, null, null);
            Node n5 = new Node(5, n4, n3);
            Node n7 = new Node(7, n11, n10);
            Node n1 = new Node(1, n5, n7);
            //printTreePostOrder(n1);
            printTreeInOrder(n1);
        }
    }
    

        