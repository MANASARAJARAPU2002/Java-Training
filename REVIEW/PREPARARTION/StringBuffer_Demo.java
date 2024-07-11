package JAVAFINAL.REVIEW.PREPARARTION;

public class StringBuffer_Demo {
public static void main(String args[]) {
	StringBuffer br= new StringBuffer();
	br.append("Hi");
	br.append("Hello");
	br.insert(1, "Manasa");
	System.out.println(br.reverse());
	StringBuilder b2= new StringBuilder();
	b2.append("Hi ");
	b2.append("Hello");
	System.out.println(b2);
			
}
}
