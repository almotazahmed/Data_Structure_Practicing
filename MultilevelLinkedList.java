
public class MultilevelLinkedList {
	LinkedListWithChild head;
	int size;
	public MultilevelLinkedList() {
		this.head=null;
		this.size=0;
	}
	
	public LinkedListWithChild createList(String arr[], int n) {
		LinkedListWithChild head1 = new LinkedListWithChild(arr[0], null, null);
		LinkedListWithChild temp = head1;
		for(int i=1; i<n; i++) {
			temp.link = new LinkedListWithChild(arr[i], null, null);
			temp=temp.link;
		}
		return head1;
	}
	
	
	public void createMultilevelList() {
        String arr1[] = new String[]{"10", "5", "12", "7", "11"};
        String arr2[] = new String[]{"4", "20", "13"};
        String arr3[] = new String[]{"17", "6"};
        String arr4[] = new String[]{"9", "8"};
        String arr5[] = new String[]{"19", "15"};
        String arr6[] = new String[]{"2"};
        String arr7[] = new String[]{"16"};
        String arr8[] = new String[]{"3"};
 
        LinkedListWithChild head1 = createList(arr1, arr1.length);
        LinkedListWithChild head2 = createList(arr2, arr2.length);
        LinkedListWithChild head3 = createList(arr3, arr3.length);
        LinkedListWithChild head4 = createList(arr4, arr4.length);
        LinkedListWithChild head5 = createList(arr5, arr5.length);
        LinkedListWithChild head6 = createList(arr6, arr6.length);
        LinkedListWithChild head7 = createList(arr7, arr7.length);
        LinkedListWithChild head8 = createList(arr8, arr8.length);
 
        head1.child = head2;
        head1.link.link.link.child = head3;
        head3.child = head4;
        head4.child = head5;
        head2.link.child = head6;
        head2.link.link.child = head7;
        head7.child = head8;
        
        this.head=head1;
	}
	
	public void mearge() {
		LinkedListWithChild temp=head, tail=head;
		if(temp==null)return;
		
		while(tail.link!=null) {
			tail=tail.link;
		}
		
		while(temp!=null) {
			if(temp.child==null) {temp=temp.link;continue;}
			tail.link=temp.child;
			temp.child=null;
			temp=temp.link;
			while(tail.link!=null) {
				tail=tail.link;
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
