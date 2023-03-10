
public class BetterTester {

	public static void main(String[] args) {
		Queue<Double> q = new Queue<Double>();
		for (int i = 0; i < 4; i++) {
			q.add(Math.random() * 3 * i);
		}
		System.out.println(q + " : size is " + q.size());
		//Should remove the last element from the queue and decrease size by one
		q.remove();
		System.out.println(q + " : size is " + q.size());
		q.add(2.0);
		System.out.println(q); 
	}

}
