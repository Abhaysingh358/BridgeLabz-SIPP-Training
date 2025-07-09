package LinkedList;

class Node {
    int rollNumber;
    String name;
    int age;
    String grade;
    Node next;

    public Node(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

public class StudentRecord {
    Node head = null;
    int size;

    public void add(int pos, int rollNumber, String name, int age, String grade) {
        Node newNode = new Node(rollNumber, name, age, grade);
        size++;

        if (pos <= 1 || head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node curr = head;
        int cnt = 1;
        while (curr.next != null && cnt < pos - 1) {
            curr = curr.next;
            cnt++;
        }

        newNode.next = curr.next;
        curr.next = newNode;
    }

    public void delete(int rollNumber) {
        if (head == null) return;

        if (head.rollNumber == rollNumber) {
            head = head.next;
            size--;
            return;
        }

        Node curr = head;
        while (curr.next != null && curr.next.rollNumber != rollNumber) {
            curr = curr.next;
        }

        if (curr.next == null) {
            System.out.println("Roll number not found.");
        } else {
            curr.next = curr.next.next;
            size--;
        }
    }

    public void search(int rollNumber) {
        if (head == null) {
            System.out.println("No record found");
            return;
        }

        Node temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                System.out.println("Roll No: " + temp.rollNumber + ", Name: " + temp.name +
                        ", Age: " + temp.age + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }

        System.out.println("No record found");
    }
    
    
    public void updateGrade(int rollNumber, String newGrade) {
        if (head == null) {
            System.out.println("No records available to update.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                System.out.println("Before Update -> Roll No: " + temp.rollNumber + ", Grade: " + temp.grade);
                temp.grade = newGrade;
                System.out.println("After Update  -> Roll No: " + temp.rollNumber + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Student with roll number " + rollNumber + " not found.");
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

        System.out.println("Initial Student Records:\n");
        record.add(0, 101, "Abhay", 20, "A");
        record.add(1, 102, "Sumit", 18, "A+");
        record.add(2, 103, "Ravi", 19, "B");
        record.print();

        System.out.println("\nDeleting record with roll number 102...\n");
        record.delete(102);
        record.print();

        System.out.println("\nSearching for roll number 102:");
        record.search(102);

        System.out.println("\nSearching for roll number 103:");
        record.search(103);
        
        record.updateGrade(103,"A");
    }
}
