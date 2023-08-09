import java.util.EmptyStackException;

public class StackWithMiddle {
	DoubleNode top,mid;
	int size;
	public StackWithMiddle() {
		top=null;
		mid=null;
		size=0;
	}
	
//	public void push(String data) {
//		DoubleNode new_node = new DoubleNode(null, null, data);
//		if(top==null) {
//			top=new_node;
//			mid=new_node;
//			size++;
//			return;
//		}
//		new_node.next=top;
//		top.prev=new_node;
//		top=new_node;
//		size++;
//		if (size % 2 != 0) {
//          mid = mid.prev;
//      }
//	}
//	
//	public void pop() {
//		if(top==null) {
//			System.out.println("The stack is empty!");
//			return;
//		}
//		if(top.next==null) {
//			top=null;
//			mid=null;
//			size--;
//			return;
//		}
//		top=top.next;
//		top.prev=null;
//		size--;
//		if(size%2==0) {
//			mid=mid.next;
//		}
//		
//	}
//	
//	public void deleteMid() {
//		if(top==null) {
//			System.out.println("The stack is empty!");
//			return;
//		}
//		if(top.next==null) {
//			top=null;
//			mid=null;
//			size--;
//			return;
//		}
//		if(size==2) {
//			mid=top;
//			top.next=null;
//			size--;
//			return;
//		}
//		
//		mid.prev.next=mid.next;
//		mid.next.prev=mid.prev;
//		if(size%2==1) {
//			mid=mid.next;
//		}
//		else mid=mid.prev;
//		size--;
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void push(String data) {
		DoubleNode new_node = new DoubleNode(null,null,data);
		if(top==null) {
			top=new_node;
			mid=new_node;
			size++;
			return;
		}
		new_node.next=top;
		top.prev = new_node;
		top=new_node;
		if (size % 2 != 0) {
            mid = mid.prev;
        }
		size++;
	}
	
	public void pop() {
		if(top==null) {
			System.out.println("The Stack Is Empty!");
			return;
		}
		if(top.next==null) {
			top=null;
			mid=null;
			size--;
			return;
		}
		if(size%2==0) {
			mid=mid.next;
		}
		top = top.next;
        top.prev=null;
		size--;
	}
	
//	
	public String findMiddle()
    {
        if (top == null) {
            System.out.println("Stack is empty now");
            throw new EmptyStackException();
        }
        return mid.data;
    }
	public String top() {
		if(top==null) {
			System.out.println("The Stack Is Empty!");
			throw new EmptyStackException();
		}else {
			return top.data;
		}
	}
	public void deleteMid() {
		if(top==null) {
			System.out.println("The Stack Is Empty!");
			return;
		}
		if(top.next==null) {
			top=null;
			mid=null;
			size--;
			return;
		}
		if(top==mid) {
			mid=mid.next;
			mid.prev=null;
			top=mid;
			size--;
			return;
		}
		mid.next.prev=mid.prev;
		mid.prev.next=mid.next;
		if(size%2==0)
			mid=mid.next;
		else 
			mid=mid.prev;
		size--;
	}
}
