package chapter14;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx01 {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("A");
		System.out.println(queue.peek());
		queue.offer("B");
		System.out.println(queue.peek());
		queue.offer("C");
		System.out.println(queue.peek());
		queue.offer("D");
		System.out.println(queue.peek());
		queue.offer("E");
		System.out.println(queue.peek());
		queue.offer("F");
		System.out.println(queue.peek());
		
		System.out.println("-------------------");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
