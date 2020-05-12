

import java.io.*;
import java.util.*;

class intStack {
	public int top=-1;
	public int size=50;
	public int[] stack;
	Scanner s1 = new Scanner(System.in);

	public void initializeStack(){
	System.out.println("Enter the size of Stack");
	int n=s1.nextInt();
	
	this.size=n;
	stack= new int[n];
	top++;
	System.out.println("Stack is initialized");
	System.out.println("Stack size : "+size);
	System.out.println("Stack top : "+top);
	System.out.println("Elements are as followed : "+Arrays.toString(stack));
	
	};

	public boolean initialized(){
		if(top==-1){
			return false;
		}
		else{
			return true;
		}
	}

	public  boolean isFull(){
		if(top==size-1){
			return false;
		} else {
			return true;
		}
	}

	public void addElements(int element){
		if(isFull()){
		stack[top]=element;
		top++;
		System.out.println("Stack size : "+size);
		System.out.println("Stack top : "+top);
		System.out.println("Element Added --->"+Arrays.toString(stack));
		System.out.println("------------------------------");
		} else {
			System.out.println("Stack is full");

		}

	}

		
		public int showTop(){
			System.out.println("current top is "+top);
			return top;
		}


		public void pop(){
			top--;
			System.out.println("current top is "+top);
		}

}
class Stack {
	public static void main(String[] args){
		System.out.println("--------Welcome to Stack Program Using Array----------");
		System.out.println("Description : Pop method just decreases top value.");

		Scanner s = new Scanner(System.in);
		
		intStack iS=new intStack();
		int  i;
		do{
		System.out.println("Choose Operations on Stack : \n1.Initialize Stack\n2.Push Elements \n3.Pop elements \n4.Current Top \n5.Exit");
		i=s.nextInt();
		
			switch(i){

			
			case 1:
			iS.initializeStack();
			System.out.println("-----------------------------");
			break;
			

			case 2:
			if(iS.initialized()){
			System.out.println("Enter elements to be pushed");
			for(int b=0;b<=iS.size;b++){
			int element=s.nextInt();
			iS.addElements(element);
			}
			} else{
				System.out.println("initialize stack first");
			}
			System.out.println("-----------------------------");
			break;

			case 3:
			if(iS.initialized()){
			iS.pop();
			System.out.println("-----------------------------");	
			} else{
				System.out.println("Initialize the stack");
				System.out.println("-----------------------------");
			}
			
			break;

			case 4:
			iS.showTop();
			System.out.println("-----------------------------");
			break;
			
			} //switch closed
			}while(i != 5); 

		

		

		 
	} // main method closed

} //Stack closed


