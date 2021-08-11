package com.telstra;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		/*MyFunction myf = (n1, n2)->{return (n1+n2);};
//		int res = myf.apply(10, 20);
//		System.out.println(res);*/
//		
//		Function<Integer, Long> f = new Class1();
//		System.out.println(f.apply(20));
//		Function<Integer, Long> f2= (n)->(long)n +3L;
//		System.out.println(f2.apply(12));
//		
//		
//		Predicate<Object> fp = new Class2();
//		System.out.println(fp.test(130));
//		Predicate<Double> pred1 = (d)->d<100;		
//		Predicate<Double> pred2 = (d)->d>75;	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("%");
//		double per = sc.nextDouble();
//		if (pred1.and(pred2).test(per))
//				System.out.println("Paased");
//
//		else
//			System.out.println("Unpassed");
//		System.out.println(pred1.and(pred2).negate().test(80.0));

		Predicate<ReverseNumber> prev = (rn)->rn.getN()==rn.Revnum();
		System.out.println("Palindrome number???" + prev.test(new ReverseNumber(12121)));
		//String palindrome
		Predicate<ReverseString> ps = (rs)->rs.getS().equals(rs.RevString());
		System.out.println("Pal string ? "+ ps.test(new ReverseString("mama")));
		Predicate<String> pf5 = (s)->s.contains("A");
		Predicate<String> pf6 = (s)->s.equalsIgnoreCase("ADMIN");
		String str = "Apple";
		System.out.println(pf5.or(pf6).test(str));
		
		
		Predicate<User> cr = (u)->u.getRole().equalsIgnoreCase("ADMIN");
		ArrayList<User> ulist = new ArrayList<User>();
		
		ulist.add(new User(10, "XXX", "Admin"));
		ulist.add(new User(11, "XXX", "Member"));
		ulist.add(new User(12, "XXX", "Admin"));
		ulist.add(new User(13, "XXX", "Customer"));
		ulist.add(new User(41, "XXX", "aDMIn"));
		
		
	 	System.out.println(getAdmin(ulist, cr).toString()); 
	 	Predicate<User> cr1 = (u)->u.getId()>=10;
	 	Predicate<User> cr2 = (u)->u.getId()<=40;
	 	
	 	System.out.println(getId10(ulist, cr1, cr2).toString());
	 	
	 	// when called composed function will first call add then multiply.
	 	Function<Integer, Integer> mul = (v)->v*2;
	 	Function<Integer, Integer> add = (v)->v+2;
	 	Function<Integer, Integer> duo = mul.compose(add);
	 	Integer res = duo.apply(3);
	 	System.out.println(res);
	 	Function<Integer, Integer> duo2 = mul.andThen(add);
	 	Integer res2 = duo2.apply(3);
	 	System.out.println(res2);
	 	
	 	//*****************UnaryoPERATOR****************
	 	//Bitwise Op
	 	UnaryOperator<Integer> xor1 = (a)-> a^1;
	 	System.out.println(xor1.apply(2)); //0010 and 0001 = 0011
	 	UnaryOperator<Integer> nd = (a)->a&1;
	 	Function<Integer, Integer> f1= xor1.compose(nd);
	 	System.out.println(f1.apply(2));
 	 	
	 	Function<Integer, Integer> f2= xor1.andThen(nd);
	 	System.out.println(f2.apply(2));
		Predicate<Integer> pred3 = (i)->i>10;
		System.out.println(isGreater(15, pred3));
	}

	
	public static ArrayList<User> getId10(ArrayList<User> alist, Predicate<User> p, Predicate<User> p1 ){
		ArrayList<User> res = new ArrayList<User>();
		for(User u:alist) {
			if(p.and(p1).test(u))
				res.add(u);
		}
		return res;
	}
	
	public static ArrayList<User> getAdmin(ArrayList<User> alist, Predicate<User> p ){
		ArrayList<User> res = new ArrayList<User>();
		for(User u:alist) {
			if(p.test(u))
				res.add(u);
		}
		return res;
	}
	public static boolean isGreater(int n, Predicate<Integer> p){
		if(p.test((Integer)n))
			return true;
		else
			return false;
	}
}