import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTester {

	@Test
	void test() {
	}
	
	@Test
	void testSize() {
		Stack<Integer> temp = new Stack<Integer>();
		//assertEquals(expected, actual)
		assertEquals(0, temp.size());
	}
	
	@Test
	void testPush() {
		Stack<Integer> temp = new Stack<Integer>();
		temp.push(5);
		assertEquals(1, temp.size());
	}
	
	@Test
	void testPop() {
		Stack<Integer> temp = new Stack<Integer>();
		temp.push(5);
		temp.pop();
		assertEquals(0, temp.size());
	}
	
	@Test
	void testAdd() {
		Queue<Integer> q = new Queue<Integer>();
		q.add(3);
		q.add(7);
		assertEquals(2, q.size());
	}
	
	@Test
	void testRemove() {
		Queue<Integer> q = new Queue<Integer>();
		q.add(3);
		q.add(7);
		q.add(4);
		q.remove();
		assertEquals(2, q.size());
	}
	
	@Test
	void testtoString() {
		Queue<Integer> q = new Queue<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q);
		assertEquals("[1, 2, 3]", q.toString());
		assertEquals("[1, 2, 3]", q.toString());
		q.remove();
		System.out.println(q);
		q.add(8);
		System.out.println(q);
	}
}
