public class Queue<T> {
	//instantiating main stack and temp stack
	Stack<T> s1;
	Stack<T> s2;
	
	//constructor contructs them
	public Queue() {
		s1 = new Stack<>();
		s2 = new Stack<>();
	}
	
	//adds the given value of type T to the beginning of the queue
	public void add(T t) {
		for (int i = 0; i < s1.size(); i+=0) {
			s2.push(s1.pop());
		} s1.push(t);
		for (int i = 0; i < s2.size(); i+=0) {
			s1.push(s2.pop());
		}
	}
	
	//removes the value from the stack at index 0 and returns it, or returns null if empty
	public T remove() {
		return s1.pop();
	}
	
	//returns the size of the main stack
	public int size() {
		return s1.size();
	}
	
	//returns the values of the queue from start to finish
	public String toString() {
		String res = "[";
		for (int i = 0; i < s1.size(); i+=0) {
			res += s1.peek() + (s1.size() != 1 ? ", " : "");
			s2.push(s1.pop());
		}
		for (int i = 0; i < s2.size(); i+=0) {
			s1.push(s2.pop());
		}
		return res + "]";
	}
	
	//returns true if the queue is empty, and false if not
	public boolean empty() {
		return s1.size() == 0;
	}
}