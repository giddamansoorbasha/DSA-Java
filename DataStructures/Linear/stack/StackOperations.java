package DataStructures.Linear.stack;
import java.util.Scanner;

class Stack{
	
	int size,top;
	int[] stack;
	
	public Stack(int size){
		this.size = size;
		top = -1;
		stack = new int[size];
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public boolean isFull() {
		return top==size-1;
	}
	
	public void push(int data) {
		if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
		top++;
		stack[top] = data;
	}
	
	public int pop() {
		 if (isEmpty()) {
	            System.out.println("Stack Underflow");
	            return -1;
	    }
		int delVal = stack[top];
		top--;
		return delVal;
	}
	
	public void dispaly() {
		System.out.print("Stack : | ");
		for (int i=0;i<=top;i++) {
			System.out.print(stack[i]+" | ");
		}System.out.println();
	}
	
}

public class StackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();
        Stack stack = new Stack(size);

        while (true) {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Is Empty?");
            System.out.println("4. Is Full?");
            System.out.println("5. Display");
            System.out.println("6. Exit\n");
            System.out.print("Choose an option (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    int popped = stack.pop();
                    if (popped != -1) {
                        System.out.println("Popped value: " + popped);
                    }
                    break;

                case 3:
                    System.out.println("Stack is " + (stack.isEmpty() ? "empty" : "not empty"));
                    break;

                case 4:
                    System.out.println("Stack is " + (stack.isFull() ? "full" : "not full"));
                    break;
                    
                case 5:
					stack.dispaly();                    
					break;

                case 6:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

