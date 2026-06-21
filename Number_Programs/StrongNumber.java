package Number_Programs;
import java.util.Scanner;

	

public class StrongNumber {
	public static int fact(int n) {
		int f=1;
		
		for(int a=n;a>0;a--) {
			f=f*a;
		}
		return f;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=in.nextInt();
		int s=0;
		int r=0;
		int t=0;
		t=n;
		while(n>0) {
			r=n%10;
			s=s+fact(r);
			n=n/10;
		}
		if(s==t) {
			System.out.println("Strong number");
		}
		else {
			System.out.println("Not strong number");
		}

	}

}
