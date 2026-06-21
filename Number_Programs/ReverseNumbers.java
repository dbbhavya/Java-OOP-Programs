package Number_Programs;
import java.util.Scanner;
public class ReverseNumbers {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int r=0;
		System.out.println("Enter number:");
		int n=in.nextInt();
		while (n>0){
			r=n%10;
			System.out.print(r);
			n=n/10;
		}
			
		}
}
