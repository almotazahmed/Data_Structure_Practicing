
public class Node {
	
	String data;
	Node link;
	
	public Node(){
		this(null,null);
	}
	public Node(String data, Node link) {
		this.data=data;
		this.link=link;
	}
	
}
