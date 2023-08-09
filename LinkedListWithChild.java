
public class LinkedListWithChild {
	String data;
	LinkedListWithChild link;
	LinkedListWithChild child;
	
	public LinkedListWithChild() {
		this(null, null, null);
	}
	public LinkedListWithChild(String data, LinkedListWithChild link, LinkedListWithChild child) {
		this.data=data;
		this.link=link;
		this.child=child;
	}
}
