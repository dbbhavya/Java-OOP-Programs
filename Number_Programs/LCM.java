package Number_Programs;
import java.util.Scanner;
public class LCM {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		System.out.println("Enter n1");
		int n1=in.nextInt();
		System.out.println("Enter n2");
		int n2=in.nextInt();
		int l=1;
		int lcm=0;
		for(int i=1;i<=n1&&i<=n2;i++)
		{
			if(n1%i==0 && n2%i==0){
				l=i;
			}
				
		}
		lcm=(n1*n2)/l;
		System.out.println(lcm);
		}



}


