//create traverse
package demo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<Integer> list3 = new ArrayList<Integer>();
//		ArrayList list3 = new ArrayList();
		//add
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(2, 300);
		
		list2.add("facebook");
		list2.add("netflix");
		list2.add("google");
		list2.add(2,"tesla");
		
		list3.add(27);
//		list3.add(100.00);
//		list3.add("sameer");
		
		for(int value: list1 ) {
			System.out.println(value);
		}
//		for(String data: list2) {
//			System.out.println(data );
//		}
		
		Iterator<String> itr = list2.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
		
		ListIterator<Integer> listItr = list1.listIterator();
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		ListIterator<Integer> list3itr = list3.listIterator();
		while(list3itr.hasNext()) {
			System.out.println(list3itr.next());
		}
		System.out.println("size of list1 " + list1.size());
	}
	
	

}
