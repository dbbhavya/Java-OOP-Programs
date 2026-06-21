package Number_Programs;
import java.util.Scanner;
public class Armstrong {
	public static void main(String args[]) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter number:");
	int n=in.nextInt();
	int s=0;
	int t=0;
	int r=0;
	t=n;
	while(n>0) {
		r=n%10;
		n=n/10;
		s=s+r*r*r;
		
	}
	System.out.println(s);
	if(t==s) {
	System.out.println("Armstrong");
	}
	else {
		System.out.println("not armstrong");
	}
}
}

