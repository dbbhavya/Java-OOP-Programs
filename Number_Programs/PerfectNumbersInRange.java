package Number_Programs;

import java.util.Scanner;

public class PerfectNumbersInRange {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    System.out.println("range staring");
		int n=in.nextInt();
		System.out.println("range ending");
		int m=in.nextInt();
		System.out.print("Perfect numbers are ");
	    for(int j=n;j<=m;j++) {
	    	int s=0;
			 for(int i=1;i<j;i++) {
				if(j%i==0) {
					s=s+i;
				}
			}
		    if(s==j) {
				System.out.print(s+" ");
			}	
	    }
	}


}
