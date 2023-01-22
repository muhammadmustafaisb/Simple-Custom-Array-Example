package customlistof;

public class Node {

		int data;
		Node next;
		
}

class LinkedList{
	
	Node head;

	public void add(int data) {
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if (head == null) {
			
			head = node;
			
		}
		
		else {
			
			Node current = head;
			while(current.next != null) {
				current = current.next;
				
			}
			current.next = node;
			
		}
		
	}
	
	public void display() {
		
		Node current = head;
		
		while (current != null) {
			
			System.out.print(" " + current.data);
			current = current.next;
			
		}
		
		System.out.println("");
	}
	
	public void atFirst(int data) {
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		node.next = head;
		head = node;
		
	}
	
	public void atIndex(int index, int data) {
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(index == 0) {
			
			atFirst(data);
			
			
		}
		
		else {
			
			Node current = head;
			
			for(int i = 0 ; i < index-1; i++) {
				
				current = current.next;
				
			}
			node.next = current.next;
			current.next = node;
			
		
		}
		
	}
	
	public void deletdata(int index) {
		
			if(index == 0) {
				
				head = head.next;
				
			}
		
			else {
				
				Node current = head;
				
				for(int i = 0 ; i < index-1; i++) {
					
					current = current.next;
					
				}		
				
				Node temp = null;
				temp = current.next;
				current.next = temp.next;
				temp = null;
			}
	}
}
