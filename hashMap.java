import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Iterator;
public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map = new HashMap<>();
		
		//add element
		map.put(1, "sameer");
		map.put(10, "potato");
		map.put(100, "carrot");
		map.put(1000, "pumpkin ");
		
		map.putIfAbsent(1, "sam");
		
		
		
		System.out.println("elements are" + map);
		System.out.println("elements are" + map.entrySet());
		System.out.println("elements are" + map.keySet());
		System.out.println("elements are" + map.values());
		System.out.println("elements at 1 is " + map.get(1));
		
		for(Entry<Integer,String> entry : map.entrySet()) {
			System.out.println(entry +",");
		}
		
		System.out.println("keys are ");
		for(Integer Keys: map.keySet()) {
			System.out.println(Keys+",");
		}
		
		System.out.println("values are");
		
		for(String value : map.values()) {
			System.out.println(value+",");
		}
		
		//using iterator
		System.out.println("-------------using iterator---------------------");
		Iterator<Entry<Integer,String>> itr = map.entrySet().iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
