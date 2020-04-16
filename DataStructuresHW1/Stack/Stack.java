package Stack;

public class Stack<Item> {

	@SuppressWarnings("unchecked")
	private Item[] q = (Item[]) new Object[1];
	
	private int top=0;
	private int length=0;
	
	public void push(Item item) {
		if(q.length==length) {
			resize(2*q.length);
		}
		q[top]=item;
		top=top+1;
		length++;
	}
	public boolean isEmpty() {
		return length ==0;
	}
	public void resize(int capacity) {
		@SuppressWarnings("unchecked")
		Item[] copy =(Item[]) new Object[capacity];
		for(int i=0;i<length;i++) {
			copy[i]=q[i];
		}
		q=copy;
	}
	public int size() {
		return length;
	}
	public Item pop() {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("The stack is empty.");
		}
		top--;
		Item item=q[top];
		if(length>0 && length==q.length/4) {
			resize(q.length / 2);
		}
		length--;
		return item;
	}
}
