package LinkedList;

class Node {
    int rollNumber;
    String name;
    int age;
    String grade;
    Node next;

    // Constructor
    public Node(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

public class StudentRecord{
	Node head;
	int size;
	
	public void add(int pos,int rollNumber, String name, int age, String grade) {
		Node newNode = new Node(rollNumber,name,age,grade);
		size++;
		
		if(pos <=1 || head == null) {
			newNode.next = head;
			head = newNode;
			return;
		}
		Node curr = head;
		int cnt = 1;
		while(curr != null && cnt < pos -1) {
			curr = curr.next;
			cnt++;
		}
		if (curr == null) {
            System.out.println("Position out of bounds. Inserting at the end.");
           
        } 
		else {
			newNode.next = curr.next;
			curr.next = newNode;
			
		}
		
		
	}
	
	public void print() {
	        Node curr = head;
	        while (curr != null) {
	            System.out.println("Roll No: " + curr.rollNumber + ", Name: " + curr.name +
	                    ", Age: " + curr.age + ", Grade: " + curr.grade);
	            curr = curr.next;
	        }
	    
	}
	
	public static void main(String[] args) {
		StudentRecord record = new StudentRecord();
		record.add(0,101, "Abhay", 20, "A");
		record.add(1, 102,"Sumit", 18,"A+");
		record.print();
	}
	
	
	
	
	
	
}