
public class DoubleNode {
	String data;
	DoubleNode next, prev;
	
	
	public DoubleNode() {
		this(null,null,null);
	}
	public DoubleNode(DoubleNode next, DoubleNode prev,String data) {
		this.data=data;
		this.next=next;
		this.prev=prev;
	}
	

}
