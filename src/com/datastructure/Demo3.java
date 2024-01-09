package com.datastructure;

public class Demo3{
final static int MAXSIZE = 8;
public static int stack[] = new int[MAXSIZE];
public static int top = -1;
/* Check if the stack is full */
public static int isfull(){
   if(top == MAXSIZE)
      return 1;
   else
      return 0;
}

/* Function to return the topmost element in the stack */
public static int peek(){
   return stack[top];
}

/* Function to insert into the stack */
public static int push(int data){
   if(isfull() != 1) {
      top = top + 1;
      stack[top] = data;
   } else {
      System.out.print("Could not insert data, Stack is full.");
   }
   return data;
}

/* Main function */
public static void main(String[] args){
   push(44);
   push(10);
   push(62);
   push(123);
   push(15);
   push(12);
   push(16);
   push(124);
   //push(15);
   System.out.print("Stack Elements: ");

   // print stack data
   for(int i = 0; i < MAXSIZE; i++) {
      System.out.print(stack[i] + " ");
   }
   System.out.print("\nElement at top of the stack: " + peek());
  }
}
