import java.util.ArrayList;
import java.util.List;

public class postOrder {
    public void traversal(TreeNode root, List<Integer> res){
        if (root == null) return;
        traversal(root.left,res);
        traversal(root.right,res);
        res.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traversal(root,res);
        return res;
    }
}
