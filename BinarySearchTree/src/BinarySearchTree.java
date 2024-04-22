import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    private class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
    }

    private TreeNode root;

    public void insert(int data) {
        TreeNode newNode = new TreeNode();
        newNode.data = data;

        if (root == null) {
            root = newNode;
        } else {
            TreeNode parent = null;
            TreeNode node = root;

            // find the node to attach the new node to
            while(node != null) {
                parent = node;
                if (data < node.data) { // go to left
                    node = node.left;
                } else { // go to the right
                    node = node.right;
                }
            }

            // attach the node
            if (data < parent.data) { // attach to the left
                parent.left = newNode;
            } else { // attach to the right
                parent.right = newNode;
            }
        }
    }

    public void display(String message) {
        System.out.println(message);
        displayInOrder(root);
    }

    private void displayInOrder(TreeNode node) {
        if (node == null) return;
        displayInOrder(node.left);
        System.out.println(node.data);
        displayInOrder(node.right);
    }

    public int height() {
        return height(root);
    }

    private int height(TreeNode node) {
        if (node == null) return -1;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public int leafNodes() {
        return leafNodes(root);
    }

    private int leafNodes(TreeNode node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;

        return leafNodes(node.left) + leafNodes(node.right);
    }

    public void displayPreOrder() {
        displayPreOrder(root);
    }

    private void displayPreOrder(TreeNode node) {
        if (node == null) return;

        System.out.println(node.data);
        displayPreOrder(node.left);
        displayPreOrder(node.right);
    }

    public void displayPostOrder() {
        displayPostOrder(root);
    }

    private void displayPostOrder(TreeNode node) {
        if (node == null) return;

        displayPostOrder(node.left);
        displayPostOrder(node.right);
        System.out.println(node.data);
    }

    public BinarySearchTree copy() {
        BinarySearchTree newTree = new BinarySearchTree();
        copy(root, newTree);
        return newTree;
    }

    private void copy(TreeNode node, BinarySearchTree newTree) {
        if (node == null) return;

        newTree.insert(node.data);
        copy(node.right, newTree);
        copy(node.left, newTree);
    }

    public void displayBreadthFirst() {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.remove();
            System.out.println(node.data);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }


    public void displayTreeStructure() {
        displayTreeStructure(root, "");
    }

    private void displayTreeStructure(TreeNode node, String prefix) {
        if (node == null) return;

        displayTreeStructure(node.right, prefix + "    ");
        System.out.println(prefix + node.data);
        displayTreeStructure(node.left, prefix + "    ");
    }

    public boolean search(int data) {
        return search(root, data);
    }

    private boolean search(TreeNode node, int data) {
        if (node == null) return false;
        if (node.data == data) return true;
        if (data < node.data) { // value must be on the left
            return search(node.left, data);
        } else {
            return search(node.right, data);
        }
    }

    public void remove(int data) {
        TreeNode parent = null;
        TreeNode node = root;

        // find the node you are deleting
        boolean done = false;
        while(!done && node != null) {
            if(data < node.data) {// go to left
                parent = node;
                node = node.left;
            } else if (data > node.data) { // go to the right
                parent = node;
                node = node.right;
            } else {
                done = true;
            }
        }

        if (node == null) return;

        if (node.left == null) {
            // where there is no left child we can do something
            // similar to what we do with a linked list - link the parent
            // node to the right child. Remember to handle the root!
            if (node == root) {
                root = node.right;
            } else if (node == parent.left) {
                parent.left = node.right;
            } else {
                parent.right = node.right;
            }
        } else {
            /* If there is a left child, we have to so something more complex.
             1. Find the right-most node of the left sub-tree
             2. Keep track of the parent of the right most node
             3. When you find the right most node replace the value in the node
                replace the value in the node you are deleting with the value in
                the right-most node.
             4. Attach the left node of the right-most node to either
                the left or the right of the right-most's parent, depending on
                which side the right most is found on.
             */
           TreeNode parentOfRightMost = node;

           TreeNode rightMost = node.left;
           while(rightMost.right != null) {
               parentOfRightMost = rightMost;
               rightMost = rightMost.right;
           }
           node.data = rightMost.data;
           if (parentOfRightMost.left == rightMost) {
               parentOfRightMost.left = rightMost.left;
           } else {
               parentOfRightMost.right = rightMost.left;
           }
        }
    }
}

