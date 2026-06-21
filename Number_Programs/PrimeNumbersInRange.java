package Number_Programs;
import java.util.Scanner;
public class PrimeNumbersInRange {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number n1:");
		int n1=in.nextInt();
		System.out.println("Second number:");
		int n2=in.nextInt();
		
		int a=1;
	    for(int j=n1;j<=n2;j++) {
	    	int c=0;
			for(int i=a;i<=j;i++) {
				if(j%i==0) {
					c=c+1;
				}

			}
			if(c==2) {
				System.out.println(j);
			}
	    }
	
	}

}
