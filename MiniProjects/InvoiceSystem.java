package MiniProjects;
import java.util.Scanner;


class invoice{
	private String part_number;
	private String part_descrip;
	private int quantity;
	private double price;
	invoice(String part_number,String part_descrip,int quantity,double price){
		this.part_number=part_number;
		this.part_descrip=part_descrip;
		setquantity(quantity);
		setprice(price);
	}
	public void setpart_num(String part_number) {
		this.part_number=part_number;
		
	}
	public void setpart_des(String part_descip) {
		this.part_descrip=part_descrip;
	}
	public void setquantity(int quantity) {
		if (quantity<0) {
			this.quantity=0;
		}
		else {
			this.quantity=quantity;
		}
			
		}
	public void setprice(double price) {
		if(price<0) {
			this.price=0;
		}
		else {
			this.price=price;
		}
	}
	public String getpart_number() {
		return part_number;
	}
	public String getpart_descp() {
		return part_descrip;
	}
	public int getquantity() {
		return quantity;
	}
	public double getprice() {
		return price;
	}
	public double getinvoiceamount() {
		return quantity*price;
	}
	
	}
public class InvoiceSystem {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter part number");
		String pn=in.nextLine();
		System.out.println("Enter part description");
		String pd=in.nextLine();
		System.out.println("Enter quantity");
		int q=in.nextInt();
		System.out.println("Enter price");
		double p=in.nextDouble();
		invoice i=new invoice(pn,pd,q,p);
		System.out.println("Part number "+i.getpart_number());
		System.out.println("Part Description "+i.getpart_descp());
		System.out.println("Quantity "+i.getquantity());
		System.out.println("Price "+i.getprice());
		System.out.println("Invoice amount "+i.getinvoiceamount());
	
	}
}


