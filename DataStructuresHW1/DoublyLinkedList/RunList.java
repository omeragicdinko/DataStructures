package DoublyLinkedList;

public class RunList {

	public static void main(String[] args) {
		LinkedList<Integer> lista=new LinkedList<Integer>();
		lista.addToFront(33);
		lista.addToFront(1);
		lista.addToFront(2);
		lista.removeFromRear();
		lista.addToFront(3);
		lista.addToFront(4);
		lista.removeFromFront();
		lista.addToRear(55);
		lista.addToRear(11);
		lista.removeFromRear();
		lista.addToRear(6);
		lista.removeFromRear();
		lista.removeFromRear();
		
		System.out.println("The size of the link is: "+ lista.count());
		
		for(int i:lista) {
			System.out.println(i);
		}
		

	}

}
