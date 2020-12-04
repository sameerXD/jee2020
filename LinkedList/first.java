package LinkedList;
import java.util.LinkedList;
import java.util.ListIterator;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		
		list.add("sameer");
		list.add("ram");
		list.add("bad");
		
		ListIterator<String> obj = list.listIterator();
		
		obj.next();
		
		obj.set("supernatural");
		
		while(obj.hasNext()) {
			System.out.println(obj.next());
		}
		
		while(obj.hasPrevious()) {
			System.out.println(obj.previous());
		}
		list.remove(1);
		System.out.println(list);

	}

}
