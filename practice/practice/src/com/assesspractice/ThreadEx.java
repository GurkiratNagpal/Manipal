package com.assesspractice;

import java.io.Serializable;
import java.util.StringTokenizer;
public class ThreadEx extends Thread{
	 public static void main(String argv[]){
		  String s= "w-e-4-re-wq";
		  String[] s1 = s.split("-");
		 
		  StringTokenizer st = new StringTokenizer(s, "-");
		  int temp = 0;
		  while (st.hasMoreTokens())
			     System.out.println(st.nextToken());
		  		System.out.println(s1[temp++]);
	 }
	 public void run(){
	  System.out.print("Thread Running");

	  
 	 }
	 
	 public void runMe(){
	  run();
	 }
	}