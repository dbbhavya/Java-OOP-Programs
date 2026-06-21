package Number_Programs;
import java.util.Scanner;
public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter n1:");
		int n1=in.nextInt();
		System.out.println("enter n2:");
		int n2=in.nextInt();
		int l=1;
		for(int i=1;i<=n1&&i<=n2;i++) {
			if(n1%i==0&&n2%i==0) {
				l=i;
			}
		}
		System.out.println("HCF is "+l);
	}


}
