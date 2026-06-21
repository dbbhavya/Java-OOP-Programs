package Functions_Methods;
import java.util.Scanner;
public class Lab1 {
	public static void main(String[] args) {
		System.out.print("Length:");
		int l;
		Scanner in=new Scanner(System.in);
		l=in.nextInt();
		in.nextLine();
		System.out.println("Width");
		int w=in.nextInt();
		in.nextLine();
		System.out.println("Height");
		int h=in.nextInt();
		in.nextLine();
		check_width( l,h, w);
		String r=check_dimension( l, h);
		System.out.println(r);
	}


public static void check_width(int l,int h,int w) {
			if(l%w!=0) {
				w=l/2;
				
			}
			System.out.println("Length "+l+" Heigth "+h+" Width "+w);
		}
public static String check_dimension(int l,int h) {
			int gcd=0;
			int heigh=0;
			if(l>h) {
				heigh=l;
			}
			else {
				heigh=h;
			}
			for(int i=1;i<heigh;i++) {
				if(l%i==0 &&h%i==0) {
					gcd=i;
				}
			
				
			}
			if(gcd<10) {
				return "valid";
			}
			else {
				return "invalid";
			}
		}
}		
