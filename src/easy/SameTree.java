package easy;

public class SameTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null && q == null)
			return true;
		else if(p == null || q==null)
			return false;
		else if(p.left==null && p.right==null && q.left==null && q.right==null && (p.val==q.val))
			return true; 
		else if(p.val == q.val){
			return  isSameTree(p.left, q.left) && isSameTree(p.right, q.right);        
		}else{
			return false;
		}
	}
}
