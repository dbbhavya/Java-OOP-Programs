package Number_Programs;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int t=n;
		int r=0;
		int s=0;
		while (n>0) {
			r=n%10;
			s=s*10+r;
			n=n/10;
			
		}
		System.out.println(s);
		if(s==t) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	
	}

}
