
public class TwoStackInArray {
	int size;
	int arr[];
	int top1;
	int top2;
	
	public TwoStackInArray(int size) {
		this.size=size;
		arr = new int[size];
		top1=-1;
		top2=size;
	}
	public void push1(int data) {
		if(top1<top2-1) {
			top1++;
			arr[top1]=data;
		}
		else {
			System.out.println("Overflow!");
			return;
		}
	}
	public void push2(int data) {
		if(top1<top2-1) {
			top2--;
			arr[top2]=data;
		}
		else {
			System.out.println("Overflow!");
			return;
		}
	}
	public int pop1() {
		if(top1>=0) {
			int x = arr[top1];
			top1--;
			return x;
		}
		else {
			System.out.println("Out!");
			System.exit(1);
		}
		return 0;
	}
	public int pop2() {
		if(top2<size) {
			int x = arr[top2];
			top2++;
			return x;
		}
		else {
			System.out.println("Out!");
			System.exit(1);
		}
		return 0;
	}
}
