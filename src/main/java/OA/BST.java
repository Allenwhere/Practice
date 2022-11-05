package OA;

public class BST {
    private int counter;
    public Node root;

    public void createBST(int[] keys) {
        counter = 0;
        for(int key : keys) {
            if(isEmpty()) {
                root = new Node(key);
            }
            else {
                insert(root,key);
            }
        }
        System.out.println(counter);
    }
    public boolean isEmpty() {return root == null;}

    private void insert(Node node, int key) {
        counter++;
        if(key<node.val) {
            if(node.left == null) {
                node.left = new Node(key);
            } else {
                insert(node.left, key);
            }
        } else {
            if(node.right == null) {
                node.right = new Node(key);
            } else {
                insert(node.right, key);
            }
        }
    }
    private class Node {
        Node left;
        Node right;
        int val;

        public Node(int val) {this.val = val;}
    }

}
