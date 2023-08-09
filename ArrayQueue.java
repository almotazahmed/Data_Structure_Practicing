import java.lang.reflect.Array;

public class ArrayQueue {
	int rear,front,size,capacity;
	int [] arr;
	
	public ArrayQueue(int capacity) {
		this.capacity=capacity;
		arr= new int[capacity];
		rear=capacity-1;
		front=0;
		this.size=0;
	}
	public boolean isFull() {
		return size==capacity;
	}
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("The ArrayQueue Is Full!");
			return;
		}
		this.rear=(this.rear+1)%this.capacity;
		this.arr[this.rear]=data;
		this.size++;
	}
	public int dequeue() {
		if(size==0) {
			System.out.println("The ArrayQueue Is Empty!");
			return Integer.MIN_VALUE;
		}
		int num = this.arr[this.front];
		this.front=(this.front+1)%capacity;
		this.size--;
		return num;
	}
}
