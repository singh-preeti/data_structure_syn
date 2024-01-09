package com.datastructure;

public class Demo{
final static int MAXSIZE = 8;
static int stack[] = new int[MAXSIZE];
static int top = -1;
public static int isfull(){
   if(top == MAXSIZE)
      return 1;
   else
      return 0;
}
public static int push(int data){
   if(isfull() != 1) {
      top = top + 1;
      stack[top] = data;
   } else {
      System.out.print("Could not insert data, Stack is full.\n");
   }
   return data;
}
public static void main(String[] args){
   int i;
   push(44);
   push(10);
   push(62);
   push(123);
   push(15);
   System.out.print("\nStack Elements: ");
   // print stack data
   for(i = 0; i < MAXSIZE; i++) {
      System.out.print(stack[i] + " ");
   }
  // System.out.print(stack[] + " ");
  }
}