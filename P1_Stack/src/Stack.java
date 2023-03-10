import java.util.ArrayList;

public class Stack<T> {
	
	//use an ArrayList as the backend structure
	ArrayList<T> data;
	
	public Stack() {
		data = new ArrayList<>();
	} 
	
	//Adds to the stack
	
	public void push(T t) {
		data.add(data.size(), t);
	}
	
	//Pop from the stack (if not empty)
	
	public T pop() {
		if(data.size() == 0) return null;
		else {
			T i = data.get(data.size() - 1);
			data.remove(data.size() - 1);
			return i;
		}
	}
	
	public int size() {
		return data.size();
	}
	
	public boolean empty() {
		return data.size() == 0;
	}
	
	public T peek() {
		return data.get(data.size() - 1);
	}
	
}
