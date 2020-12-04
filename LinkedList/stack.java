package LinkedList;

import java.util.Stack;

public class stack {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		stack.push("sameer");
		stack.push("richierich");
		stack.push("kar98");
		stack.push("lock me");
		stack.push("args22");
		
//		for(String str : stack ) {
//			System.out.println(str);
//		}
//		System.out.println(stack.pop());
		String sam = stack.pop();
		System.out.println(sam);
		
		while(stack.empty()) {
			System.out.println(stack.pop());
		}
	}

}
