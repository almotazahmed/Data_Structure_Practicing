import java.util.*;
public class TreeList {
	Tree root;
	
	public TreeList() {
		root=null;
	}
	
	public void preOrder(Tree tree) {
		Tree tempTree = tree;
		if(tempTree==null)return;
		System.out.print(tempTree.data+" ");
		preOrder(tempTree.left);
		preOrder(tempTree.right);
	}
	
	public void preOrderItretive(Tree root) {
		if(root==null)return;
		Stack<Tree> stack = new Stack<>();
		stack.push(root);
		while(!stack.empty()) {
			Tree temp = stack.pop();
			System.out.print(temp.data+" ");
			if(temp.right!=null) {
				stack.push(temp.right);
			}
			if(temp.left!=null) {
				stack.push(temp.left);
			}
		}
		
	}
	public void postOrder(Tree tree) {
		Tree tempTree = tree;
		if(tempTree==null)return;
		postOrder(tempTree.left);
		postOrder(tempTree.right);
		System.out.print(tempTree.data+" ");
	}
	
	public void printLevels() {
		int h = hight(root);
		int i;
		for(i=1; i<=h; i++) {
			printLevel(root,i);
		}
	}
	
	public int hight(Tree root) {
		if(root == null)return 0;
		int lHight = hight(root.left);
		int rHight = hight(root.right);
		
		if(lHight>rHight)return lHight+1;
		else return rHight+1;
	}
	
	
	public void printLevel(Tree root, int i) {
		if(root == null)
			return;
		
		if(i==1)
			System.out.print(root.data+" ");
		else if(i>1) {
			printLevel(root.left, i-1);
			printLevel(root.right, i-1);
		}
	}
	
	
	public int hight2() {
		Tree temp = root;
		int d = 0;
		while(temp != null) {
			d++;
			temp=temp.left;
		}
		return d;
	}
	
	public boolean checkIfPrefect(Tree temp, int d, int level) {
		if(temp==null) {
			return true;
		}
		if(temp.left==null&&temp.right==null) {
			return(d==level+1);
		}
		if(temp.left==null || temp.right==null) {
			return false;
		}
		return(checkIfPrefect(temp.left, d, level+1)&&checkIfPrefect(temp.right, d, level+1));
	}
	
	public boolean isPerfect() {
		int d = hight2();
		return checkIfPrefect(root, d, 0);
	}
	
	public int findMax() {
		return findMax(root);
	}
	
	public int findMax(Tree root) {
		if(root==null)
			return Integer.MIN_VALUE;
		
		int result = root.data;
		
		int left=findMax(root.left);
		int right=findMax(root.right);
		
		if(left>result)
			result = left;
		
		if(right>result)
			result= right;
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
