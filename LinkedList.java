
public class LinkedList {
	Node firstNode;
	String data;
	int length;
	
	public LinkedList() {
		// TODO Auto-generated constructor stub
		firstNode=null;
		length=0;
	}
	public void print() {
		Node N = firstNode;
		while(N!=null) {
			System.out.print(N.data + " ");
			N=N.link;
		}
	}
	public void insertFirst(String N) {
		Node x = new Node(N, null);
		x.link=firstNode;
		firstNode=x;
		length++;
	}
	
	public void insertBet(String N, int index) {
		Node nn = new Node(N, null);
		if(firstNode==null) {
			firstNode=nn;
			length++;
			return;
		}
		Node temp = firstNode;
		int tempInx=1;
		while(tempInx!=index-1) {
			tempInx++;
			temp = temp.link;
//			if(tempInx==index-1)break;
		}
		nn.link=temp.link;
		temp.link=nn;
		length++;
	}
	
	public void insertLast(String N) {
		Node x = new Node(N, null);
		if(firstNode==null) {
			firstNode=x;
			length++;
			return;
		}
		Node temp = firstNode;
		while(temp.link!=null)
			temp=temp.link;
		temp.link=x;
		length++;
	}
	
	public void deleteFirst() {
		if(firstNode==null)
			return;
		firstNode=firstNode.link;
		length--;
	}
	
	public void deleteLast() {
		if(firstNode==null)return;
		else if(firstNode.link==null) {firstNode=null;length--;return;}
		Node temp = firstNode;
		while(temp.link.link!=null)temp=temp.link;
		temp.link=null;
		length--;
	}
	
	public void deleteData(String da) {
		if(firstNode==null)return;
		else if(firstNode.data==da) {firstNode=firstNode.link;length--;return;}
		Node temp = firstNode;
		while(temp.link.link!=null && temp.link.data!=da) {
			temp=temp.link;
		}
		temp.link=temp.link.link;
		length--;
	}
	
	public int getCount(Node N) {
		if(N==null)return 0;
		
		return 1+getCount(N.link);
	}
	
	public int getCounting() {
		return getCount(firstNode);
	}
	///////////////////////////Reverse/////////////////////////////	
	public void reverse() {
		Node current = firstNode, next=null, prev=null;
		
		while (current!=null) {
			next=current.link;
			current.link=prev;
			prev=current;
			current=next;
		}
		firstNode=prev;
	}
	////////////////////////////////////////////////////////////////
	
	///////////////////////////Mearge///////////////////////////////
	public Node mearge(Node one, Node two) {
		Node temp = new Node("", null);
		Node tail=temp;
		while(one!=null && two!=null) {
			if(one.data.length()<=two.data.length()) {
				tail.link=one;
				one=one.link;
			}
			else {
				tail.link=two;
				two=two.link;
			}
			tail=tail.link;
		}
		if(one==null) {
			tail.link=two;
		}
		else {
			tail.link=one;
		}
		return temp.link;
	}
	////////////////////////////////////////////////////////////////
	
	public Node reverseGroup(Node head, int k) {
		Node current = head, prev=null, next=null;
		if(head == null) {
			return null;
		}
		int count = 0;
		while(current != null && count < k) {
			next=current.link;
			current.link=prev;
			prev=current;
			current=next;
			count++;
		}
		if(next!=null)
			head.link=reverseGroup(next, k);
		return prev;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
