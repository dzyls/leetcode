package com.solution.leetcode;

/**
 * 572. ��һ����������
 * 
 * @author Administrator
 * 
 */
public class Subtree {

	public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null) {
	    	 return false;
	     }
	     if(isEqual(s,t)) {
	    	 return true;
	     }
	     
	     return isSubtree(s.left,t)||isSubtree(s.right,t);
   }
   public  boolean isEqual(TreeNode s,TreeNode t) {  //�ж��������Ƿ���ͬ
		if(s==null&&t==null) {
			return true;
		}else if(s==null&&t!=null) {
			return false;
		}else if(s!=null&&t==null) {
			return false;
		}else {
			if(s.val!=t.val) {
				return false;
			}
		}
		
		return isEqual(s.left,t.left)&&isEqual(s.right,t.right);
	}


}
