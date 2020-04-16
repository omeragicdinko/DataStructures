package Queue;

public class Queue<Item> {
	private Node<Item> head=null;
	private Node<Item> tail=null;
	private int length=0;
	
	public void enqueue(Item item) {
		Node<Item> newNode=new Node<Item>();
		newNode.data=item;
		if(isEmpty()) {
			head=newNode;
			tail=newNode;
			length++;
		}
		else{
			head.next=newNode;
			head=newNode;
			length++;
		}
	
	}
	public boolean isEmpty() {
		return head==null;
	}
	public Item dequeue() {
		if(isEmpty()){
			throw new IndexOutOfBoundsException("Queue is empty");
		}
		Item data=tail.data;
		tail=tail.next;
		if(tail==null) {
			head=null;
		}
		length--;
		return data;
	}
	public int size() {
		return length;
	}
}
