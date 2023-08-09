
public class BinarySearchTree {
	Tree root;
	public BinarySearchTree() {
		root=null;
	}
	
	public void insert(int data) {
		root = insert(root, data);
	}
	
	public Tree insert(Tree temp, int data) {
		
		if(temp == null) {
			return new Tree(data);
		}
		if(data<temp.data) {
			temp.left=insert(temp.left, data);
		}
		else {
			temp.right=insert(temp.right, data);
		}
		
		return temp;
	}
	
	public void inOrder() {
		inOrder(root);
	}
	
	public void inOrder(Tree temp) {
		if(temp==null)
			return;
		
		inOrder(temp.left);
		System.out.print(temp.data+" ");
		inOrder(temp.right);
	}
	
	public Tree search(Tree root, int key) {
		if(root==null || root.data==key) {
			return root;
		}
		if(key<root.data) {
			return search(root.left, key);
		}
		else {
			return search(root.right, key);
		}
		
	}
	
//	public void delete(Tree root, int key) {
//		if(root==null) {
//			return;
//		}
//		if(key==root.data) {
//			root=null;
//			return;
//		}
//		if(root.left.data==key && root.right)
//	}
	public boolean isValid() {
		return isValid(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	public boolean isValid(Tree root, int min, int max) {
		if(root == null)return true;
		
		if(root.data>=max || root.data<=min) {
			return false;
		}
		boolean left = isValid(root.left, min, root.data);
		if(left) {
			return isValid(root.right, root.data, max);
		}
		return false;
	}
	
	public void delete(int key) {
		root = delete(root, key);
	}
	public Tree delete(Tree root, int key) {
		Tree p, q, s;
		if(root==null) {
			System.out.println("The Key Is Not Found!!");
			return root;
		}
		else if(key<root.data) {
			root.left = delete(root.left, key);
			return root;
		}
		else if(key>root.data) {
			root.right = delete(root.right, key);
			return root;
		}
		else {
			s=root;
			q=root;
			if(q.right == null) {
				root=q.left;
			}
			else if(q.left == null) {
				root=q.right;
			}
			else {
				p = q.right;
				while(p.left != null) {
					s = p;
					p = p.left;
				}
				root = p;
				root.left = q.left;
				s.left = p.right;
				if(q.right == p) {
					root.right = p.right;
				}
				else {
					root.right = q.right;
				}
			}
			return root;
		}
	}
	
	
	public void printMeargeBST(Tree firstBST, Tree secondBST) {
		IntegerLinkedList firstList = new IntegerLinkedList();
		IntegerLinkedList secondList = new IntegerLinkedList();
		inOrderList(secondBST, secondList);
		inOrderList(firstBST, firstList);
		
		IntegerLinkedList resultList = new IntegerLinkedList();
		resultList.firstNode = mearge(firstList.firstNode, secondList.firstNode);
		resultList.print();
		return;
	}
	
	
	
	public void inOrderList(Tree temp, IntegerLinkedList ll) {
		if(temp==null)
			return ;
		inOrderList(temp.left, ll);
		ll.insertLast(temp.data);
		inOrderList(temp.right, ll);
	}
	
	
	public IntegerNode mearge(IntegerNode firstList, IntegerNode secondList) {
		IntegerNode resultList = new IntegerNode(0);
		IntegerNode tail = resultList;
		while(firstList!=null && secondList!=null) {
			if(firstList.data<=secondList.data) {
				tail.link = firstList;
				tail=tail.link;
				firstList=firstList.link;
			}
			else {
				tail.link=secondList;
				tail=tail.link;
				secondList=secondList.link;
			}
		}
		if(firstList!=null) {
			tail.link=firstList;
		}
		if(secondList!=null) {
			tail.link=secondList;
		}
		return resultList.link;
	}
	
	public int countNodes() {
		return countNodes(root);
	}
	
	public int countNodes(Tree root)
    {
        if (root == null)
            return 0;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
	
	
	
	
	
	
	

}

