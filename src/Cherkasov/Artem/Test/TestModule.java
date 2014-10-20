package Cherkasov.Artem.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Cherkasov.Artem.PriorityQueue.PriorityQueueImpl;

public class TestModule {
	
	private final int N = 10;
	private PriorityQueueImpl<Integer, String> pq;
	
	@Before
	public void putData(){
		pq = new PriorityQueueImpl<Integer, String>(N + 1);
		pq.insert(4, "four");
		pq.insert(10, "ten");
		pq.insert(2, "two");
		pq.insert(8, "eight");
		pq.insert(5, "five");
		pq.insert(1, "one");
	}
	
	@Test
	public void testData(){
		assertEquals(6, pq.size());
		assertEquals("ten", pq.getMax());
		assertEquals("eight", pq.getMax());
		assertEquals("five", pq.getMax());
		assertEquals("four", pq.getMax());
		assertEquals("two", pq.getMax());
		assertEquals("one", pq.getMax());
		assertEquals(0, pq.size());
	}

}
