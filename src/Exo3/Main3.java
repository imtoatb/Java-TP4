package Exo3;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {


        Stack stack = new Stack(100);
        Queue queue = new Queue(100);
        LinkedList linkedList = new LinkedList();

        Scanner sc = new Scanner(System.in);
        // infinite loop
        while (1 == 1) {
            int choice;
            System.out.println("1. Manage a stack");
            System.out.println("2. Manage a queue");
            System.out.println("3. Manage a linked list");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                int choice2;
                Scanner sc2 = new Scanner(System.in);
                System.out.println("1. Push an element");
                System.out.println("2. Pop an element");
                System.out.println("3. Check if the stack is empty");
                System.out.println("4. Display the stack");
                System.out.println("0. Return to main menu");
                System.out.print("Your choice: ");
                choice2 = sc2.nextInt();

                if (choice2 == 1) {
                    int element;
                    Scanner scElement = new Scanner(System.in);
                    System.out.print("Enter the element to push: ");
                    element = scElement.nextInt();
                    stack.push(element);
                } else if (choice2 == 2) {
                    stack.pop();
                } else if (choice2 == 3) {
                    stack.isEmpty();
                } else if (choice2 == 4) {
                    System.out.println(stack);
                } else if (choice2 == 0) {
                    System.out.println("Return to main menu");
                } else {
                    System.out.println("Invalid choice");
                }
            } else if (choice == 2) {
                int choice3;
                Scanner sc3 = new Scanner(System.in);
                System.out.println("1. Add an element");
                System.out.println("2. Remove an element");
                System.out.println("3. Check if the queue is empty");
                System.out.println("4. Display the queue");
                System.out.println("0. Return to main menu");
                System.out.print("Your choice: ");
                choice3 = sc3.nextInt();

                if (choice3 == 1) {
                    int element;
                    Scanner scElement = new Scanner(System.in);
                    System.out.print("Enter the element to add: ");
                    element = scElement.nextInt();
                    queue.add(element);
                } else if (choice3 == 2) {
                    queue.remove();
                } else if (choice3 == 3) {
                    queue.isEmpty();
                } else if (choice3 == 4) {
                    System.out.println(queue);
                } else if (choice3 == 0) {
                    System.out.println("Return to main menu");
                } else {
                    System.out.println("Invalid choice");
                }
            } else if (choice == 3) {
                int choice4;
                Scanner sc4 = new Scanner(System.in);
                System.out.println("1. Add an element");
                System.out.println("2. Remove an element");
                System.out.println("3. Display the linked list");
                System.out.println("0. Return to main menu");
                System.out.print("Your choice: ");
                choice4 = sc4.nextInt();

                if (choice4 == 1) {
                    int element;
                    Scanner scElement = new Scanner(System.in);
                    System.out.print("Enter the element to add: ");
                    element = scElement.nextInt();
                    linkedList.add(element);
                } else if (choice4 == 2) {
                    int element;
                    Scanner scElement = new Scanner(System.in);
                    System.out.print("Enter the element to remove: ");
                    element = scElement.nextInt();
                    linkedList.remove(element);
                } else if (choice4 == 3) {
                    System.out.println(linkedList);
                } else if (choice4 == 0) {
                    System.out.println("Return to main menu");
                } else {
                    System.out.println("Invalid choice");
                }
            } else if (choice == 0) {
                System.out.println("Exit");
            } else {
                System.out.println("Invalid choice");
            }

        }
    }
}