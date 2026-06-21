package Patterns;

public class pattern_collection {

	public static void main(String[] args) {
		
        for(int i=1;i<=4;i++) {
        	for(int k=1;k<=4-i;k++) {
        		System.out.print(" ");
        	}
        	for(int j=1;j<=i;j++) {
        		System.out.print("*");
        	}
        	   System.out.println();
        }
        int n=1;
        for(int i=1;i<=5;i++) {
        	for(int k=1;k<=5-i;k++) {
        		System.out.print(" ");
        	}
        	int num=(int)Math.pow(11, i-1);
        	while(num>0) {
        		int digit=num%10;
        		System.out.print(digit+" ");
        		num=num/10;
        	}
        	System.out.println();
        }
        for(int i=1;i<=5;i++) {
        	for(int j=1;j<=5-i;j++) {
        		System.out.print(" ");
        	}
        	for(int k=1;k<=i;k++) {
        		System.out.print(k);
        	}
        	for(int a=i-1;a>=1;a--) {
        		System.out.print(a);
        	}
        	System.out.println();
        }
        char ch='A';
        for(int i=1;i<=5;i++) {
        	for(int j=1;j<=5-i;j++) {
        		System.out.print(" ");
        	}
        	for(int k=1;k<=i;k++) {
        		System.out.print(ch);
        		ch++;
        	}
        	for(int a=i-1;a>=1;a--) {
        		System.out.print(ch);
        		ch--;
        	}
        	System.out.println();
        }
     
	}

}
