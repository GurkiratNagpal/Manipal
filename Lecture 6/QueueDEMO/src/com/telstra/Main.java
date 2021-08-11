package com.telstra;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<String>();
		q.add("Pretty");
		q.add("Script");
		q.add("Well");
		q.add("Pretty");
		q.add("Script");
		q.add("Well");
		
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.remove());

		System.out.println(q);

	}

}
