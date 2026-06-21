package Basics;
import java.util.Scanner;

public class scanner_input {
	public static void main(String a[]) {
		int n1,n2;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter radius");
		double r=in.nextDouble();
		n1=in.nextInt();
		n2=in.nextInt();
		System.out.println(n1+n2);
		System.out.println(r);
		
	}
}
