package Cherkasov.Artem.PriorityQueue;

public class PriorityQueueImpl<K extends Comparable<K>,T> implements PriorityQueue<K,T> {
	
	private Node<K, T>[] priorityQueue;
	private int N = 0;

	@SuppressWarnings("unchecked")
	public PriorityQueueImpl(int n) {
		priorityQueue = new Node[n];
	}
	
	public boolean isEmpty(){
		return (N == 0);
	}
	
	public int size(){
		return N;
	}
	
	private void swim(int k){
		while(k > 1 && less(k/2, k)){
			exch(k/2, k);
			k = k/2;
		}
	}
	
	private void sink(int k){
		while(2*k <= N){
			int  j = 2*k;
			if(j < N && less(j, j+1)) ++j;
			if(!less(k,j)) break;
			exch(k, j);
			k = j;
		}
	}
	
	@Override
	public T getMax() {
		T max = priorityQueue[1].getT();
		exch(1, N--);
		priorityQueue[N + 1] = null;
		sink(1);
		return max;
	}

	@Override
	public void insert(K k, T t) {
		Node<K, T> node = new Node<K, T>(k, t);
		priorityQueue[++N] = node;
		swim(N);
	}
	
	private boolean less(int first, int second){
		return priorityQueue[first].getK().compareTo(priorityQueue[second].getK()) < 0;
	}
	
	private void exch(int first, int second){
		Node<K, T> node = priorityQueue[first];
		priorityQueue[first] = priorityQueue[second];
		priorityQueue[second] = node;
	}
	
}
