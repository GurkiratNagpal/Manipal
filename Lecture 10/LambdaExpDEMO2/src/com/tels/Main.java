package com.tels;

import java.util.ArrayList;
import java.util.function.Consumer;


public class Main {
	public static void main(String[] args) {
	 Matho  add = (int a, int b)->a+b ;
	 System.out.println(add.operation(10, 20));
	 
	 Matho  sub = (int a, int b)->a-b ;
	 System.out.println(sub.operation(10, 20));
	 
	 Matho  mul = (a,b)->a*b ;
	 System.out.println(mul.operation(10, 20));
	 Classtemp c1 = new Classtemp("Blue", 12.3) {
		
		@Override
		public String paint() {
			// TODO Auto-generated method stub
			return (color+rad);
		}
	};
	 
	 System.out.println(c1.paint());
	 CircleInt ci = (c, r)->{return(c+" "+r);};
	 System.out.println(ci.paint("RED", 10));
	 
	 isOdd i = (number)->{return(number%2==0)?false:true;};
	 System.out.println("IS I ODD?  "+ i.isOdd(10));
	
	 isPrime ip = (num)->{
		 for(int j=2; j<Math.sqrt(num); j++) {
			 if (num%j==0) 
				 return false;
		 }
		 return true;
	 };
	 System.out.println("is n prime?"+ ip.isP(91));
	
	 
	 FormatFtring ff1 = (s)->"Hello"+s;
	 FormatFtring ff2 = (s)->"HelloWORLD "+s;
	 System.out.println(ff1.sformat("Gurri").toLowerCase()+ff2.sformat("Nagpal").toUpperCase());

	 
	 ArrayList<Integer> nos = new ArrayList<Integer>();
	 nos.add(5);
	 nos.add(15);
	 nos.add(52);
	 nos.add(52);
	 nos.add(56); 
	 nos.add(50);
	 nos.forEach((n)->{System.out.println(n);});
	 
	 
	 Consumer<Integer> func = (n)->{System.out.println(n); };
	 nos.forEach(func);
	 
	 Generic<Integer> gp= (n1, n2)->(n1+n2);
	 System.out.println(gp.process(20, 25));
	 Generic<Double> gp2= (n1, n2)->(n1+n2);
	 System.out.println(gp2.process(20.00, 25.00));
	 
	 //ArrayList<String>
	 
	}
	
	
	
	
	public static int operate(int a, int b, Matho mop) {
		return mop.operation(a, b);
	}
}