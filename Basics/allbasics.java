package Basics;
import java.util.Scanner;
public class allbasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner in=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=in.nextInt();
		int s=0;

		while(n>0) {
		    s=s+n;
		    n--;
		}
		System.out.println("Sum:"+s);
	}*/
		/*Scanner in=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=in.nextInt();
		
		System.out.println("ENter second number:");
		int m=in.nextInt();
		for(int b=n;b<=m;b++) {
			int s=0;
		for(int a=1;a<=b;a++) {
			if(b%a==0) {
				s=s+1;
			}
			
		}
		if(s==2) {
			System.out.println(b+" "+"is prime.");
		}
		
		
		}*/
		/*Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int r=0;
		int t=n;
		while(n>0) {
			int re=n%10;
			r=re+r*10;
			n=n/10;
		}
		System.out.println(r);
		if(t==r) {
			System.out.println("Palindrome");
		}*/
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int s=n*n;
		if(n>=1&&n<=9) {
			if((s%10)==n) {
				System.out.println("Automorphic number");
			}
			else {
			System.out.println("Not automorphic number");
			}
		}
		else if(n>=10&&n<=99) {
			if((s%100)==n) {
				System.out.println("Automorphic number");
			}
			else {
			System.out.println("Not Automorphic number");
			}
		}
		else {
			if((s%1000)==n) {
				System.out.println("Automorphic number");
			}
			else {
				System.out.println("Not automorphic number");
			}
		}

}
}
