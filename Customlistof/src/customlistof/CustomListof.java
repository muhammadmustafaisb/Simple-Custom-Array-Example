package customlistof;

public class CustomListof {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(8);
		list.add(8);
		
	
		list.display();
		list.atFirst(10);
		list.display();
		list.atFirst(50);
		list.display();
		list.atIndex(1, 70);
		list.display();
		list.deletdata(0);
		list.display();
		list.deletdata(0);
		list.display();	
		list.deletdata(0);
		list.display();
		list.deletdata(9);
		list.display();
		list.deletdata(8);
		list.display();
	}

}

