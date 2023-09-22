package collection.queue;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		List<String> mylist = new LinkedList<>();
		
		mylist.add("A");
		mylist.add("B");
		mylist.add("C");
		
		System.out.println(mylist);
		
		for(String list : mylist) {
			System.out.print(list+ " ");
		}
	}

}
