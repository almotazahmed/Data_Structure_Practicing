
public class IntegerLinkedList {
	IntegerNode firstNode;
	int size;
	public IntegerLinkedList() {
		this.firstNode=null;
		this.size=0;
	}
	public void print() {
		IntegerNode temp = firstNode;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.link;
		}
	}
	public void insertLast(int data) {
		IntegerNode newNode = new IntegerNode(data);
		if(firstNode==null) {
			firstNode = newNode;
			size++;
			return;
		}
		IntegerNode temp = firstNode;
		while(temp.link!=null) {
			temp=temp.link;
		}
		temp.link = newNode;
		size++;
	}
	
}
