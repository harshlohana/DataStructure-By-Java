import java.util.*;
import java.util.Stack; //importing the stack class

class Stack2{
    
    Scanner s=new Scanner(System.in);
    public static void main (String[] args) {



    
    Scanner s=new Scanner(System.in);
    System.out.println("-----------------Welcome to Stack program using Stack------------");
    int n;
    Stack stack=new Stack();
    do{
    System.out.println("Enter the choice of operation:\n1.Initailize\n2.push\n3.pop\n4.Show top\n5.Search\n6.Exit");
    n=s.nextInt();

    switch(n){

        case 1:
        System.out.println("-----------------------------");
        System.out.println("Stack initialized");
        System.out.println("-----------------------------");
        break;

        case 2:
        System.out.println("Enter the element to be added");
        int e=s.nextInt();
        stack.push(e);
        System.out.println("-----------------------------");
        System.out.println("Current Stack ==>"+stack);
        System.out.println("-----------------------------");
        break;

        case 3:
        stack.pop();
        System.out.println("-----------------------------");
        System.out.println("Current Stack ==>"+stack);
        System.out.println("-----------------------------");
        break;

        case 4:
         System.out.println("-----------------------------");
        System.out.println("Current Stack ==>"+stack);
        System.out.println("-----------------------------");
        stack.peek();
        System.out.println("Top position is : "+( stack.peek()));
         System.out.println("-----------------------------");
        break;

        case 5:
        System.out.println("Enter the element to search");
        int search=s.nextInt();
        System.out.println("-----------------------------");
        stack.search(search);
        System.out.println("Position : "+(stack.search(search)));
        System.out.println("-----------------------------");
        break;

        default:
        System.out.println("Enter the valid choices");

        break;

    }


    }while(n!=6);
  


  }

}


