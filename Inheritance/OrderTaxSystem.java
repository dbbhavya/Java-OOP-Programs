package Inheritance;
class order{
	int id;
	double amount;
	order(int id,double amount){
		this.id=id;
		this.amount=amount;
	}
	
}
class international extends order{
	international(int id,double amount){
		super(id,amount);
	}
	double caltax() {
		return amount*0.15;
	}
}
class domestic extends order{
	domestic(int id,double amount){
		super(id,amount);
	}
	double caltax() {
		return amount*0.05;
	}
}
public class OrderTaxSystem {

	public static void main(String[] args) {
		international i=new international(101,1000);
		domestic d=new domestic(102,1000);
		double total;
		total=i.caltax()+d.caltax();
		System.out.println(total);
		System.out.println("Internationl: "+i.caltax());
		System.out.println("Domestic "+d.caltax());
		
	}
}



