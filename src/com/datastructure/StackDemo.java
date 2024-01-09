package com.datastructure;

import java.util.Stack;

public class StackDemo {
 public static void main(String[] args) {
	
	 Stack<String> color = new Stack<>();
	 color.push("Red");
	 color.push("Blue");
	 color.push("Black");
	 color.push("Brown");
	 color.push("White");
	 
	 System.out.println(color);
	 System.out.println("The stack top element:" + color.peek());
	 
	 color.pop();
	 
	 System.out.println(color);
	 System.out.println("The stack top element:" + color.peek());
}

}
