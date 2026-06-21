package Number_Programs;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a=0;
		int b=1;
		int c=0;
		System.out.println("Here is the Fibonacci series upto  "+n+" terms");
		System.out.print(a+" "+b+" ");
		for(int i=1;i<n-1;i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;	
		}
	}

	}


