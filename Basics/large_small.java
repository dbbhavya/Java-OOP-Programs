package Basics;
import java.util.Scanner;
public class large_small {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("how many?");
		int n=in.nextInt();
		int l=0;
		int m=0;
		while(n>0)
		{
			int i=in.nextInt();
			
			if (i>l)
			{
				l=i;
			}
			else {
				m=i;
			}
			
			n--;
		}
	
	System.out.println("Largest is "+l);
	System.out.println("Lowest is "+m);
	}
}
