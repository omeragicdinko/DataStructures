package DoublyLinkedList;

import java.util.Iterator;

public class LinkedList<Item> implements Iterable<Item>{
	private Node<Item> head;
	private Node<Item> tail;
	private int size=0;
	
	private class LinkedListIterator implements Iterator<Item>{
		Node<Item> current=head;
		
		public boolean hasNext() {
			return current!=null;
		}
		public Item next() {
			Item item=current.data;
			current=current.next;
			return item;
		}
	}
	public int count() {
		return size;
	}
	public boolean isEmpty() {
		return head==null;
	}
	public Iterator<Item> iterator() {
		return new LinkedListIterator();
	}
	public void addToFront(Item item) {
		Node<Item> newNode=new Node<Item>();
		newNode.data=item;
		if(isEmpty()) {
			head=tail=newNode;
		}
		else {
			newNode.next=head;
			head.previous=newNode;
			head=newNode;
		}
		size++;
	}
	public void removeFromFront() {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("The link list is empty.");
		}
		else if(size==1) {
			head=tail=null;
		}
		else {
			head=head.next;
			head.previous=null;
		}
		size--;
	}
	public void addToRear(Item item) {
		Node<Item> newNode=new Node<Item>();
		newNode.data=item;
		if(isEmpty()) {
			tail=head=newNode;
		}
		else {
			newNode.previous=tail;
			tail.next=newNode;
			tail=newNode;
		}
		size++;
	}
	public void removeFromRear() {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("The link list is empty.");
		}
		if(size==1) {
			tail=head=null;
		}
		else {
			tail=tail.previous;
			tail.next=null;
		}
		size--;
	}
	
	
	
}
