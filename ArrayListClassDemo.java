package corejava.collection;
 
import java.util.ArrayList;
 
public class ArrayListClassDemo {
 
	public static void main(String[] args) {
		ArrayList<Integer> arrList=new ArrayList<>();
		for(int i=0;i<=10;i++) {arrList.add(i+2);}
		
		System.out.println("First Element "+arrList.get(0));
		System.out.println("Last Element "+arrList.get(arrList.size()-1));
		
 
	}
 
}
 