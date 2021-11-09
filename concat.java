package hello;
import java.util.Scanner;
public class concat {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the first string :");
		String firstStr=sc.next();
		
		System.out.println("enter the second string:");
		String secondStr=sc.next();
		
		System.out.println("result after concatenation");
		System.out.println(firstStr+" "+secondStr);
		

	}

}
