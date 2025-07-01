package corejava.collection;
 
import java.util.ArrayList;
import java.util.Collections;
 
public class ArrayListClassDemo {
 
	public static void main(String[] args) {
		ArrayList<Integer> arrList=new ArrayList<>();
		for(int i=0;i<=10;i++) {arrList.add(i+2);}
		
		System.out.println("First Element "+arrList.get(0));
		System.out.println("Last Element "+arrList.get(arrList.size()-1));
		System.out.println("is Contains 3 : "+arrList.contains(3));
		arrList.remove(4); //4th index element
		Collections.sort(arrList);
		Collections.sort(arrList,Collections.reverseOrder());//sorted in descending order
		Collections.reverse(arrList);
		arrList.clear();
		
		// 55,77,99,22
 
	}
 
}
 
 
package corejava.collection;
 
import java.util.LinkedList;
 
public class LinkedListClassDemo {
 
	public static void main(String[] args) {
    LinkedList<String> linkList=new LinkedList<>();
    linkList.add("Anirudha");
    linkList.push("Dinesh");
    linkList.addFirst("Amish");
    linkList.addLast("Harsh");
    linkList.offer("Amisha");
    linkList.offerFirst(null);
    linkList.offerLast(null);
    
    System.out.println("Peek element "+linkList.peek());
    System.out.println("Peek First element "+linkList.peekFirst());
    System.out.println("Peek Last element "+linkList.peekLast());
    
    linkList.set(2,"Amit");
    linkList.remove(4);
    linkList.remove("Anirudha");
    
    linkList.forEach(element-> System.out.println(element+" "));
    
    String arr[]=linkList.toArray(new String[0]);
 
	}
 
}
 
 