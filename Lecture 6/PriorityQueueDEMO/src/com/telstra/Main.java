package com.telstra;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Item> pq = new PriorityQueue<Item>();
		pq.add(new Item(5, "pen"));
		pq.add(new Item(6, "pencil"));
		pq.add(new Item(2, "Dashboards"));
		pq.add(new Item(51, "peraser"));
		pq.add(new Item(16, "Marker"));
		pq.add(new Item(110, "Board"));
		
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);

	}

}