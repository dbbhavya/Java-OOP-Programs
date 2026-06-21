package Number_Programs;
import java.util.Scanner;
/*class fact{
	public static int factorial(int i) {
		if (i==0) {
			return 1;
		}
		int fa=1;
		for(int j=1;j<=i;j++) {
			fa=fa*j;
		}
		return fa;
	}
}*/

public class Extra_Prgms_On_Numbers {

	public static void main(String[] args) {
/*		int s=0;
		int n=1;
		while(n<11) {
			s=s+n;
			n++;
		}
		System.out.println(s);
		
	}
}*/
/*		int n=1;
		int s=0;
		while(n<8) {
			s=s+n;
			System.out.print(n);
			n++;
		}
		System.out.println();
		System.out.println("Sum of natural numbers upto 7 terms is "+ s);
	}
}*/
/*		int i=1;
		int c=0;
		while (i<=5){
			c=i*i*i;
			System.out.println("Number is 1 "+i +" and cube is "+c);
			i++;
		}
			
		}
			
		}*/
/*		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a=1;
		while(a<11) {
			System.out.print(" "+n+"X"+a+"="+(n*a));
			a++;
		}
	}
}*/
/*		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int a=1;a<11;a++) {
			for(int a1=1;a1<=n;a1++) {
				System.out.print(" "+a1+"X"+a+"="+(a1*a));
			}
			System.out.println();
		}
	}
}*/
/*		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int s=0;
		for (int i=1;i<=n;i=i+2) {
			System.out.print(i+" ");
			s=s+i;
			
		}
		System.out.println();
		System.out.print(s);
		}
}*/
 /*   	Scanner in=new Scanner(System.in);
		int n=1;
		for(int i=1;i<=4;i++) {
			for(int k=0;k<=4-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" "+"*"+" ");
				n++;
			}
			System.out.println();
		}
	}
}*/
/*	Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		double s=0;
		for(int i=1;i<=n;i++) {
			if(i==n) {
				System.out.print(i+" ");
			}
			else {
			System.out.print(i+"+1/");
			s=s+(1.0/i);
			}
		}
		System.out.println();
		System.out.println(s);
		}
}*/
/*		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.println("ENTER NUMBER OF TERMS:");
		int i=0;
		int s=0;
		for (int j=0;j<n;j++) {
			i=i*10+9;
			s=s+i;
			System.out.print(i+" ");
	
		}
		System.out.println();
		System.out.println(s);
	}
}*/
/*		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=i;j++) {
				if((i+j)%2==0) {
					System.out.print("1");
				}
					else {
						System.out.print("0");
					}
				}
			System.out.println();
			}
		}
}*/
/*		Scanner in=new Scanner(System.in);
		int s=0;
		double f=0;
		System.out.println("enter number of terms");
		int n=in.nextInt();
		System.out.println("enterr value of x:");
		int x=in.nextInt();

		for (int i=0;i<n;i++) {
			f=(Math.pow(x, i)/fact.factorial(i))+f;
		}
		System.out.println(f);
	}
}*/
/*		Scanner in=new Scanner(System.in);
		System.out.println("Enter x:");
		int x=in.nextInt();
		System.out.println("Terms:");
		int n=in.nextInt();
		double f=0;
		double s=0;
		for(int i=1;i<=n;i++) {
			f=(int)(Math.pow(-1, i-1)*Math.pow(x, 2*i-1));
			s=s+f;
			System.out.println(f);
		
		}
		System.out.println("Sum = "+s);
	}
}*/
/*		Scanner in=new Scanner(System.in);
		System.out.println("Enter terrms:");
		int n=in.nextInt();
		int s=0;
		for(int i=1;i<=n;i++) {
			s=s+i*i;
			System.out.print(" "+i*i);
		}
		System.out.println();
		System.out.println("Sum of squares is "+s);
	}
}*/
		Scanner in=new Scanner(System.in);
		System.out.println("terms:");
		int n=in.nextInt();
		int s=0;
		int r=0;
		for(int i=1;i<=n;i++) {
			s=s*10+1;
			r=r+s;
			if(i==1) {
				System.out.print(s+" ");
			}
			else {
			System.out.print(" +"+s);
			}
		}
		System.out.println();
		System.out.println("The Sum is: "+r);
	}
}
		

		
		
		
		
		
		
