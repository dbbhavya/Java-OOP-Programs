package Classes_and_Objects;

import java.util.Scanner;
class movie {
	private int code;
	private int screennumber;
	private int seatcount;
	movie(int code,int screennumber,int seatcount){
		this.code=code;
		this.screennumber=screennumber;
		this.seatcount=seatcount;
	}
	public void checkcode() {
		
		int s=0;
		for (int i=1;i<=code;i++) {
			if(i%code==0) {
				s=s+1;
			}
			else {
				s=s+0;
			}
		}
		if(s==2) {
			System.out.println("Movie code approved");
			}
		else {
			System.out.println("Movie code is rejected");
			}
		}
	public void adjustseatcount() {
		if(seatcount>screennumber*50) {
		   seatcount=screennumber*50;
		   System.out.println(seatcount);
		}
		else {
			System.out.println(seatcount);
		}
		
	}
	
}
public class movie_management {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter moviecode:");
		int code=in.nextInt();
		System.out.println("Enter screennumber:");
		int screennumber=in.nextInt();
		System.out.println("Enter seatcount");
		int seatcount=in.nextInt();
		movie m=new movie(code,screennumber,seatcount);
		m.checkcode();
		m.adjustseatcount();
		
	}
}
