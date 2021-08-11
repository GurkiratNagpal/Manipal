package test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "hello";
		System.out.println(a.getClass().getName());
		if (a.getClass().getName() == "java.lang.String") {
			System.out.println("123");
		} else {
			System.out.println("457");
		}
	}

}
