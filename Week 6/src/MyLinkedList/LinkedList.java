package MyLinkedList;

public class LinkedList {
	
	private Node front;
	
	/**
	 * 
	 * Add to the front
	 */
	public void addFront(int value){
		Node node = new Node(value);
		node.value = value;
		node.next = front; //this is null;
		front = node;
	}
	
	/**
	 * 
	 * size of the list
	 */
	public int sizeOfList(){
		int count = 1;
		
		Node start = front;
		while(start.next != null){
			count++;
			start = start.next;
		}
		
		return count;
	}
	
	/**
	 * 
	 * Remove node from front
	 */
	Node removeFront(){
		 Node temp = front;
		front = front.next;
		return temp;
	}
	
	/**
	 * Remove Node from the end
	 */
	Node removeEnd(){
		
		Node temp = front;
		while(temp.next.next !=null){
			temp = temp.next;
		}
		Node removed = temp.next;
		temp.next = null;
		return removed;
	}
	
	/**
	 * Get at an index
	 * 
	 */
	Node getAtIndex(int i){
		int count = 0;
		Node start = front;
		while(count != i){
			start = start.next;
			if(start==null)
				return new Node(-1);
			count++;
		}
		return start;
	}

}
