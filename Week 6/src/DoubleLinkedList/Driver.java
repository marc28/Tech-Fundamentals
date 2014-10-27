package DoubleLinkedList;

public class Driver {

	public Driver() {
		LinkedList l = new LinkedList();
		Node front = new Node(0);
		l.insertAfterTheFront(55,front);
		l.insertAfterTheFront(2,front);
		l.insertAfterTheFront(99,front);
		System.out.println("Size: " + l.sizeOfLinkedList(front)); //3
		Node removed = l.removeFromEnd(front); 
		System.out.println(removed.value); //3
		System.out.println("Size: " + l.sizeOfLinkedList(front)); //2
	}

	public static void main(String[] args) {
		new Driver();

	}

}
