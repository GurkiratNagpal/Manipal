package com.telstra;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> s = new Stack<String>();
		s.push("Gurkirat");
		s.push("Nagpal");
		s.push("22");
		System.out.println(s);
		s.peek();
		System.out.println(s.peek());
		s.pop();
		System.out.println(s);
		s.add("Luaao");
		s.remove(0);
		System.out.println(s);
		System.out.println(s.search("Cuds"));
		System.out.println(s.contains("Nagpal"));
		

	}

}