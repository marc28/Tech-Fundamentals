package MyLinkedList;

public class Driver {

	public Driver() {
		LinkedList l = new LinkedList();
		l.addFront(3);
		l.addFront(2);
		l.addFront(1);
		
		System.out.println(l.sizeOfList());
		Node atIndex = l.removeEnd();
		System.out.println(atIndex.value);
		System.out.println(l.sizeOfList());
	}

	public static void main(String[] args) {
		new Driver();
	}

}
