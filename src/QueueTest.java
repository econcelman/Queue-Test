import java.util.LinkedList;

public class QueueTest {
	static LinkedList<Character> queue = new LinkedList<Character>();

	public static void main(String[] args) {
			
			enqueue ('a');
			enqueue ('b');
			enqueue ('c');
			enqueue ('d');
			enqueue ('e');
			dequeue();
			enqueue ('f');
			enqueue ('g');
			dequeue(); 
			enqueue ('h');
			enqueue ('i');
			enqueue ('j');
			enqueue ('k');
			enqueue ('l');
			enqueue ('m');
			
			
	}
				
			public static void enqueue (char c) {
				
				
				if(queue.size() >=10)
					throw new RuntimeException("Queue overflow");
				queue.add(c);
				System.out.println("Adding " + c + " to queue");
				
			}
			
			public static void dequeue() {
				
			
				if(queue.size() == 0)
					throw new RuntimeException("Queue underflow");
				
				System.out.println("Removing " + queue.getFirst() + " from queue");
				queue.removeFirst();
				
			}
			
	

}
