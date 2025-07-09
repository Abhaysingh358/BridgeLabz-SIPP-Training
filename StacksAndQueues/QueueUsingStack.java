package StacksAndQueues;
import java.util.Stack;
public class QueueUsingStack{
	Stack<Integer> inStack =  new Stack<>();
	Stack<Integer> outStack = new Stack<>();
	
//	enqueue  operation 
	public void enqueue(int data) {
		inStack.push(data);
		
		
	}
	
//	method to check stack is empty or not
	public boolean isEmpty() {
		return inStack.isEmpty() && outStack.isEmpty();
	}
	
//	dequeue operation
	public int  dequeue() {
		if(isEmpty()) {
			throw new RuntimeException("queue is empty");
		}
		if(outStack.isEmpty()) {
//			transfer all elemnts from instack to outstack
			while(!inStack.isEmpty()) {
				outStack.push(inStack.pop());
			}
		}
		return outStack.pop();
		
	}
	
//	peek 
	
	public int peek() {
		if(isEmpty()) {
			 throw new RuntimeException("queue is empty");
		}
		if(outStack.isEmpty()) {
			while(!inStack.isEmpty()) {
				outStack.push(inStack.pop());
			}
		}
		return outStack.pop();
	}
	
	 public int size() {
	        return inStack.size() + outStack.size();
	    }
	
	public static void main(String[] args) {
		QueueUsingStack queue = new QueueUsingStack();
		queue.enqueue(5);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(17);
		queue.enqueue(45);
		 System.out.println("Dequeued: " + queue.dequeue());
		 System.out.println("Peek: " + queue.peek()); 
		 System.out.println("Dequeued: " + queue.dequeue()); 
	     System.out.println("Dequeued: " + queue.dequeue());
	     System.out.println("Is Empty: " + queue.isEmpty());
	        
		
		
		
	}
	
}
