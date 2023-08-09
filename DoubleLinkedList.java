
public class DoubleLinkedList {
	DoubleNode firstNode;
	int length=0;
	
	public void print() {
		DoubleNode temp = firstNode;
		if(firstNode==null)System.out.println("The List is Empty!");
		else {
			while(temp.next!=null) {
				System.out.print(temp.data + ' ');
				temp=temp.next;
			}
			System.out.print(temp.data + ' ');
			System.out.println();
			while(temp.prev!=null) {
				System.out.print(temp.data + ' ');
				temp=temp.prev;
			}
			System.out.print(temp.data + ' ');
		}
	}
	public void insertFirst(String data) {
		DoubleNode new_Node = new DoubleNode(null, null, data);
		new_Node.next=firstNode;
		if(firstNode!=null)
			firstNode.prev=new_Node;
		firstNode=new_Node;
		length++;
	}
	
	public void insertAfterIndex(String data, int idx) {
		DoubleNode new_Node = new DoubleNode(null,null,data);
		DoubleNode temp = firstNode;
		if(idx>length || idx<1) {
			System.out.println("Invalid Index");
			return;
		}
		for(int i=1; i<=length && i!=idx; i++) {
			temp=temp.next;
		}
//		if(idx==length) {
//			new_Node.next=temp.next;
//			new_Node.prev=temp;
//			temp.next=new_Node;
//			length++;
//			return;
//		}
		new_Node.next=temp.next;
		new_Node.prev=temp;
		temp.next=new_Node;
		 if (new_Node.next != null)
		        new_Node.next.prev = new_Node;
		length++;
	}
///////////////////////////Double lists mearge/////////////////////////////	
	public DoubleNode mearge(DoubleNode one, DoubleNode two) {
		DoubleNode temp = new DoubleNode(null,null,"");
		DoubleNode tail=temp;
		while(one!=null && two!=null) {
			if(one.data.length()<=two.data.length()) {
				tail.next=one;
				tail.next.prev=tail;
				one=one.next;
			}
			else {
				tail.next=two;
				tail.next.prev=tail;
				two=two.next;
			}
			tail=tail.next;
		}
		if(one==null) {
			tail.next=two;
			tail.next.prev=tail;
		}
		else {
			tail.next=one;
			tail.next.prev=tail;
		}
		temp=temp.next;
		temp.prev=null;
		return temp;
	}
	
//////////////////////////////////////////////////////////////////////////	
	public void reverse() {
		DoubleNode current = firstNode, prev=null, next=null;
		
		while(current!=null) {
			next=current.next;
			current.prev=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		firstNode=prev;
	}
}
