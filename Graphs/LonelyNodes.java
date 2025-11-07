import java.util.*;

class TreeNode{
    int val;
    TreeNode left, right;

    TreeNode(int val){
        this.val = val;
        left = right = null;
    }
}
class LonelyGraph{
    public static List<Integer> findLonelyNodes(TreeNode root){
        List<Integer> lonely = new ArrayList<>();
        if(root == null) return lonely;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            TreeNode current = q.poll();

            if((current.left != null) ^ (current.right != null)){
                if(current.left != null){
                    lonely.add(current.left.val);
                } else {
                    lonely.add(current.right.val);
                }
            }
            if(current.left != null) q.add(current.left);
            if(current.right != null) q.add(current.right);
        }
        return lonely;
    }

}

public class LonelyNodes{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);

        System.out.println(LonelyGraph.findLonelyNodes(root));
    }
}
