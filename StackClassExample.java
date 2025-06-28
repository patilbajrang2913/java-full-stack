package corejava.collection;
 
import java.util.Stack;
 
public class StackClassExample {
void stackDemo() {
	Stack<String> stack=new Stack<>();
	stack.push("Apple");
	stack.push("Banana");
	stack.push("Orange");
	System.out.println("Top Element : "+stack.peek());
	System.out.println("POP Element : "+stack.pop());
	System.out.println("is Empty : "+stack.isEmpty());
	System.out.println("Search Element : "+stack.search("Banana"));
 
 
	
}
}