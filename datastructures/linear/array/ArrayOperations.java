package datastructures.linear.array;
import java.util.Scanner;

public class ArrayOperations {

	// Insert Operation 
	public int[] insert(int[] array, int data, int index) {
	    int[] newArr = new int[array.length + 1];
	    for (int i = 0, j = 0; i < newArr.length; i++) {
	        if (i == index) {
	            newArr[i] = data;
	        } else {
	            newArr[i] = array[j++];
	        }
	    }
	    return newArr;
	}

    // Delete Operation
	public int[] delete(int[] array, int data) {
	    int count = 0;
	    for (int i = 0; i < array.length; i++) {
	        if (array[i] == data) count++;
	    }
	    if (count == 0) return array;

	    int[] newArr = new int[array.length - count];
	    for (int i = 0, j = 0; i < array.length; i++) {
	        if (array[i] != data) {
	            newArr[j++] = array[i];
	        }
	    }
	    return newArr;
	}

    // Search Operation
	public int search(int[] array, int data) {
	    for (int i = 0; i < array.length; i++) {
	        if (array[i] == data) {
	            return i;
	        }
	    }return -1; 
	}

    // Display Operation
	public void display(int[] array) {
	    System.out.print("Array : ");
	    for (int data : array) {
	        System.out.print(data + " ");
	    }System.out.println();
	}


	public static void main(String[] args) {
		ArrayOperations array = new ArrayOperations();
        Scanner sc = new Scanner(System.in);

        int[] arr = {};

        while (true) {
            System.out.println("\n----- Array Operations Menu -----\n");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Exit\n");
            System.out.print("Choose an option (1-5): ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int value = sc.nextInt();
                    System.out.print("Enter index (0 to " + arr.length + "): ");
                    int index = sc.nextInt();
                    if (index < 0 || index > arr.length) {
                        System.out.println("Invalid index!");
                    } else {
                        arr = array.insert(arr, value, index);
                        System.out.println("Element inserted.");
                    }
                    break;

                case 2:
                    System.out.print("Enter value to delete: ");
                    int delValue = sc.nextInt();
                    arr = array.delete(arr, delValue);
                    break;

                case 3:
                    System.out.print("Enter value to search: ");
                    int searchVal = sc.nextInt();
                    int foundIndex = array.search(arr, searchVal);
                    if (foundIndex != -1) {
                        System.out.println("Element found at index: " + foundIndex);
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;

                case 4:
                    array.display(arr);
                    break;

                case 5:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select between 1 and 5.");
            }
        }
	}
}