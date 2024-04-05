public class BinarySearchTree {
    private class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
    }

    TreeNode root;

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
}
