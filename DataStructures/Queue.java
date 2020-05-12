import java.io.*;
import java.util.*;
//import java.util.ArrayList;




class QueueClass{
	int size;
	int front=-1;
	int rear=-1;
	int[] queue;
	Scanner s1=new Scanner(System.in);

	public void initialize(){

		System.out.println("Enter the Size of Queue");

		int size=s1.nextInt();
		if(size > 0){
		this.size=size;
		queue= new int[size];
		System.out.println("Queue is initialized");
		rear++;
		front++;
		System.out.println("rear : "+rear);
		System.out.println("front : "+front);
		System.out.println("Current Queue : "+Arrays.toString(queue));
		} else {
			System.out.println("Enter the valid size");
		};
	}

	public void enqueue(){
		if(rear >= 0){
			
			System.out.println("Enter the Elements of Queue");
			int element=s1.nextInt();
			queue[rear]=element;
			rear++;

			System.out.println("Current Queue : "+Arrays.toString(queue));

		} else {
			System.out.println("Initialize the Queue first");
		}
		
	}

	public void dequeue(){
		if(rear > 0){
			if(front < size){
			System.out.println("Dequeue is processed on : "+queue[front]);
			System.out.println("Dequeue is processed on : "+Arrays.toString(queue));
			front++;
			

			} else {
				System.out.println("No elements to Dequeue");
			}
			
		} else{
			System.out.println("Enter the elements first");
		}
	}


	public void display(){
		System.out.println("Current Queue :"+(Arrays.toString(queue)));
		System.out.println("Current Size :"+size);
		System.out.println("Current Front Pointer :"+front);
		System.out.println("Current Rear pointer :"+rear);
	}

	public void isFull(){
		if(rear==front){
			System.out.println("Queue is Empty");
		}
		else{
			System.out.println("Queue is not Empty");
			System.out.println("Available Capacity : "+(size-rear));
		}
	}


}

class Queue{

	public static void main(String[] args){
		
		System.out.println("--------Welcome to Queue Program Using Arrays---------");
		Scanner s=new Scanner(System.in);
		QueueClass queue=new QueueClass();
		int n;
		do{
		System.out.println("Enter Your choice : \n1.Initialize\n2.Enqueue\n3.Dequeue\n4.Display Attributes\n5.Check Capacity Available\n6.Exit");
		n=s.nextInt();

		switch(n){
			case 1:
			System.out.println("-------------------------------------------");
			queue.initialize();
			System.out.println("-------------------------------------------");
			break;

			case 2:
			System.out.println("-------------------------------------------");
			queue.enqueue();
			System.out.println("-------------------------------------------");
			break;

			case 3:
			System.out.println("-------------------------------------------");
			queue.dequeue();
			System.out.println("-------------------------------------------");
			break;

			case 4:
			System.out.println("-------------------------------------------");
			queue.display();
			System.out.println("-------------------------------------------");
			break;

			case 5:
			System.out.println("-------------------------------------------");
			queue.isFull();
			System.out.println("-------------------------------------------");

			default:
			System.out.println("-------------------------------------------");
			System.out.println("Enter the valid Choices");
			System.out.println("-------------------------------------------");
			break;

		}

		

		}while(n!=6);
	}
}