package Cherkasov.Artem.EntryPoint;

import Cherkasov.Artem.PriorityQueue.PriorityQueueImpl;

public class Main {
	
	private final static int N = 10;

	public static void main(String[] args) {
		PriorityQueueImpl<Integer, String> pq = new PriorityQueueImpl<Integer, String>(N + 1);
		pq.insert(4, "four");
		pq.insert(10, "ten");
		pq.insert(2, "two");
		pq.insert(8, "eight");
		pq.insert(5, "five");
		pq.insert(1, "one");
		System.out.println("size = " + pq.size());
		System.out.println(pq.getMax());
		System.out.println(pq.getMax());
		System.out.println(pq.getMax());
		System.out.println(pq.getMax());
		System.out.println(pq.getMax());
		System.out.println(pq.getMax());
		
	}

}
