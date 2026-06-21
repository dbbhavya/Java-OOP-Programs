package Classes_and_Objects;

import java.util.Scanner;
class booking{
	int ticket;
	int seat;
	int price;
	booking(int ticket,int seat,int price){
		this.ticket=ticket;
		this.seat=seat;
		this.price=price;
	}
	public void checkticket() {
		int temp=ticket;
		int r=0;
		int p=0;
		while(ticket>0) {
			r=ticket%10;
			p=p*10+r;
			ticket=ticket/10;
			
		}
		System.out.println(p+""+ticket);
		if (p==temp) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Not valid");
		}
	}
	public void adjustprice() {
		if(price<seat) {
			price=seat*10;
			System.out.println("Updated ticketprice");
		}
		
	}
}
public class booking_system{
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter ticketnumber");
		int ticket=in.nextInt();
		in.nextLine();
		System.out.println("Enter seatnumber");
		int seat=in.nextInt();
		in.nextLine();
		System.out.println("Enter price");
		int price=in.nextInt();
		in.nextLine();
		booking b=new booking(ticket,seat,price);
		b.checkticket();
		b.adjustprice();
		
	}
}
