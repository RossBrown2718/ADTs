import java.util.ArrayList;

public class Queue<T> {
	
	//use an ArrayList as the backend structure
	ArrayList<T> arr;
	
	public Queue() {
		s1 = new Stack<T>();
		
	} 
	
	//Adds to the stack
	
	public void add(T t) {
		arr.add(arr.size(), t);
	}
	
	//Pop from the stack (if not empty)
	
	public T remove() {
		return arr.size() == 0? null : arr.get(0);
	}
	
	public int size() {
		return arr.size();
	}
	
	public boolean empty() {
		return arr.size() == 0;
	}
	
	public T peek() {
		return arr.get(0);
	}
	
}
