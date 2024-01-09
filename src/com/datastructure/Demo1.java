package com.datastructure;

public class Demo1{
final static int MAXSIZE = 8;
public static int stack[] = new int[MAXSIZE];
public static int top = -1;
/* Check if the stack is empty */
public static int isempty(){
   if(top == -1)
      return 1;
   else
      return 0;
}
/* Check if the stack is full*/
public static int isfull(){
   if(top == MAXSIZE)
      return 1;
   else
      return 0;
}
/* Function to delete from the stack */
public static int pop(){
   int data = 0;
   if(isempty() != 1) {
      data = stack[top];
      top = top - 1;
      return data;
   } else {
      System.out.print("Could not retrieve data, Stack is empty.");
   }
   return data;
}
/* Function to insert into the stack */
public static int push(int data){
   if(isfull() != 1) {
      top = top + 1;
      stack[top] = data;
   } else {
      System.out.print("\nCould not insert data, Stack is full.\n");
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
   System.out.print("Stack Elements: ");
   // print stack data
   for(int i = 0; i < MAXSIZE; i++) {
      System.out.print(stack[i] + " ");
   }
   
   System.out.print("\nElements popped: ");

   // print stack data
   while(isempty() != 1) {
      int data = pop();
      System.out.print(data + " ");
   }
  }
}
