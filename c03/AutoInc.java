package c03;

//:AutoInc.java
// Demonstrates the ++ and -- operators

public class AutoInc {
	static void prt (String s) {
		System.out.println(s);
	}
	
	public static void main (String[] args) {
		int i = 1;
		prt("i : " + i);
		prt("++i : " + ++i);
		prt("i++ : " + i++);
		prt("i : " + i);
		prt("--i : " + --i);
		prt("i-- : " + i--);
		prt("i : " + i);	
	}
}///:~
