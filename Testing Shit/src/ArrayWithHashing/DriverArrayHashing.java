package ArrayWithHashing;

public class DriverArrayHashing {

	public DriverArrayHashing() {
		MyLinkedList [] ray = new MyLinkedList[3];
		
		MyLinkedList l1 = new MyLinkedList();
		l1.addFront("marc");
		l1.addFront("trish");
		l1.addFront("lisa");
		l1.addFront("junie");
		
		MyLinkedList l2 = new MyLinkedList();
		l2.addFront("cat");
		l2.addFront("dog");
		l2.addFront("sheep");
		
		MyLinkedList l3 = new MyLinkedList();
		l3.addFront("cake");
		l3.addFront("tea");
		l3.addFront("coffee");
		l3.addFront("chocolate");
		l3.addFront("sugar");
		l3.addFront("biscuit");
		
		ray[0] = l1;
		ray[1] = l2;
		ray[2] = l3;
		ray[0].printValues();
		ray[1].printValues();
		ray[2].printValues();
		
		System.out.println("First list length: " + ray[0].listSize());
		System.out.println("Second list length: " + ray[1].listSize());
		System.out.println("Third list length: " + ray[2].listSize());
	}

	public static void main(String[] args) {
		new DriverArrayHashing();

	}

}
