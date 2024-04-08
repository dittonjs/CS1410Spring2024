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

    public void display() {
        display(root, "");
    }

    private void display(TreeNode node, String prefix) {
        if (node == null) return;

        display(node.right, prefix + "    ");
        System.out.println(prefix + node.data);
        display(node.left, prefix + "    ");
    }

    public boolean find(int data) {
        return find(root, data);
    }

    private boolean find(TreeNode node, int data) {
        if (node == null) return false;
        if (node.data == data) return true;
        if (data < node.data) { // value must be on the left
            return find(node.left, data);
        } else {
            return find(node.right, data);
        }
    }

    public void remove(int data) {
        TreeNode parent = null;
        TreeNode node = root;

        // find the node to attach the new node to
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
            if (node == root) {
                root = node.right;
            } else if (node == parent.left) {
                parent.left = node.right;
            } else {
                parent.right = node.right;
            }
        } else { // left node == less easy
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

