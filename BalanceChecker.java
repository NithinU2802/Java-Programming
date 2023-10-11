class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreeBalanceChecker {

    public boolean isBalanced(TreeNode root) {
        return checkBalance(root) != -1;
    }

    private int checkBalance(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = checkBalance(node.left);
        if (leftHeight == -1) {
            return -1; 
        }

        int rightHeight = checkBalance(node.right);
        if (rightHeight == -1) {
            return -1; 
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1; 
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(3);

        BinaryTreeBalanceChecker checker = new BinaryTreeBalanceChecker();
        boolean isBalanced = checker.isBalanced(root);

        if (isBalanced) {
            System.out.println("The tree is balanced.");
        } else {
            System.out.println("The tree is not balanced.");
        }
    }
}
