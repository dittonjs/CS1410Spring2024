public class HomeworkBST {
    private class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    private TreeNode root;

    public void displayInOrder() {
        displayInOrder(root);
    }

    public void remove(int value) {
        TreeNode parent = null;
        TreeNode node = root;
        boolean done = false;
        while (!done && node != null) {
            if (node.value < value) {
                parent = node;
                node = node.right;
            } else if (node.value > value) {
                parent = node;
                node = node.left;
            } else {
                done = true;
            }
        }
        // Case for no left child
        if (node.left == null) {
            if (parent == null) {
                root = node.right;
            } else {
                if (parent.value < value) {
                    parent.right = node.right;
                } else {
                    parent.left = node.right;
                }
            }
        } else { // Case for left child
            TreeNode parentOfRight = node;
            TreeNode rightMost = node.left;
            while (rightMost.right != null) {
                parentOfRight = rightMost;
                rightMost = rightMost.right;
            }
            node.value = rightMost.value;
            if (parentOfRight.right == rightMost) {
                parentOfRight.right = rightMost.left;
            } else {
                parentOfRight.left = rightMost.left;
            }
        }
    }

    private void displayInOrder(TreeNode node) {
        if (node == null) return;

        displayInOrder(node.left);
        System.out.println(node.value);
        displayInOrder(node.right);
    }

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            TreeNode parent = null;
            TreeNode node = root;
            while (node != null) {
                parent = node;
                if (node.value < value) {
                    node = node.right;
                } else {
                    node = node.left;
                }
            }

            TreeNode newNode = new TreeNode(value);
            if (parent.value < value) {
                parent.right = newNode;
            } else {
                parent.left = newNode;
            }
        }
    }

    public boolean search(int value) {
        boolean found = false;
        TreeNode node = root;

        while (!found && node != null) {
            if (node.value == value) {
                found = true;
            } else if (node.value < value) {
                node = node.right;
            } else {
                node = node.left;
            }
        }

        return found;
    }

}