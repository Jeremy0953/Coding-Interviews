import com.sun.source.tree.Tree;

public class Solution4 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root = null;
        if(pre.length!=0)
            root = new TreeNode(pre[0]);
        else
            return root;
        int root_in_index = 0;
        for (root_in_index = 0; root_in_index<in.length; root_in_index++)
        {
            if (pre[0]==in[root_in_index])
                break;
        }
        int [] pre_left = new int[root_in_index];
        int [] pre_right = new int[in.length-root_in_index-1];
        int [] in_left = new int[pre_left.length];
        int [] in_right = new int[pre_right.length];
        for (int i =0; i<in.length;i++)
        {
            if (i<root_in_index)
            {
                in_left[i] = in[i];
                pre_left[i] = pre[i+1];
            }
            if (i>root_in_index)
            {
                in_right[i - root_in_index - 1] = in[i];
                pre_right[i - root_in_index - 1] = pre[i];
            }
        }
        root.left = reConstructBinaryTree(pre_left,in_left);
        root.right = reConstructBinaryTree(pre_right,in_right);
        return root;
    }

    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        TreeNode treeNode = solution4.reConstructBinaryTree(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{3, 2, 4, 1, 6, 5, 7});
    }
}

