package DoubleLinkedList;

public class LinkedList {

	
	void insertAfterTheFront(int value, Node where){
		
		Node newNode = new Node(value);
		newNode.previous = where;
		 
		if(where.next !=null){
			where.next.previous = newNode;
		}
		newNode.next = where.next;
		where.next = newNode;
		
	}
	
	
	int sizeOfLinkedList(Node front){
		Node temp = front;
		int count = 0;
		
		while(temp.next != null){
			count++;
			temp = temp.next;
		}
		return count;
		
	}
	
	Node removeFromFront(Node front){
		Node temp = front.next;
		front.next = temp.next;
		temp.next.previous = front;
		
		return temp;
	}
	
	Node removeFromEnd(Node front){
		Node temp = front;
		while(temp.next.next !=null){
			temp = temp.next;
		}
		Node gone = temp.next;
		temp.next = null;
		
		return gone;
	}
	

}
