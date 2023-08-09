
public class CircularLinkedList {
	Node last;
	int length;
	
	public CircularLinkedList() {
		last=null;
		length=0;
	}
	public void print() {
		if(last==null) {
			System.out.println("The List is empty!");
			return;
		}
		Node temp = last.link;
		while(temp!=last){
			System.out.print(temp.data+' ');
			temp=temp.link;
		}
		System.out.print(temp.data+'\n');
	}
	
	public void insertFirst(String data) {
		Node new_node = new Node(data, null);
		if(last==null) {
			last=new_node;
			last.link=last;
			length++;
			return;
		}
		
		new_node.link=last.link;
		last.link=new_node;
		length++;
	}
	
	public void insertLast(String data) {
		Node new_node = new Node(data, null);
		if(last==null) {
			last=new_node;
			last.link=last;
			length++;
			return;
		}
		
		new_node.link=last.link;
		last.link=new_node;
		last=new_node;
		length++;
		
	}
	
	public void RemoveFirst() {
		if(last==null) {
			System.out.println("The list is Empty!");
			return;
		}
		if(last.link==last) {
			last=null;
			length--;
			return;
		}
		last.link=last.link.link;
		length--;
	}
	
	public void RemoveLast() {
		if(last==null) {
			System.out.println("The list is Empty!");
			return;
		}
		if(last.link==last) {
			last=null;
			length--;
			return;
		}
		Node temp = last;
		while(temp.link!=last) {
			temp=temp.link;
		}
		temp.link=last.link;
		last=temp;
		length--;
	}
	
	public void insertSorted(String data) {
		Node new_node = new Node(data,null);
		if(last == null) {
			last=new_node;
			last.link=last;
			length++;
			return;
		}
		if(last.link == last) {
			if(last.data.length()<new_node.data.length()) {
				new_node.link=last.link;
				last.link=new_node;
				last=new_node;
			}
			else {
				new_node.link=last;
				last.link=new_node;
			}
			length++;
			return;
		}
		Node temp = last;
		if(temp.data.length()<=new_node.data.length()) {
			new_node.link=temp.link;
			temp.link=new_node;
			last=new_node;
			length++;
			return;
		}
		while(temp.link.data.length()<new_node.data.length()&&temp.link!=last) {
			temp=temp.link;
		}
		new_node.link=temp.link;
		temp.link=new_node;
		length++;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
