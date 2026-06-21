package Inheritance;
class  vehicle{
	int licenceplate;
	double rate;
	vehicle(int licenceplate,double rate){
		this.licenceplate=licenceplate;
		this.rate=rate;
	}
	double calrent(int days) {
		return days*rate;
	}
}
class car extends vehicle{
	car(int licenceplate,double rate){
		super(licenceplate,rate);
	}
	double calrent(int days) {
		return days*rate;
	}
}
class motorcycle extends vehicle{
	motorcycle(int licenceplate,double rate){
		super(licenceplate,rate);
	}
	double calrent(int days) {
		double total=days*rate;
	    if(days>7) {
		  return total-(total*0.1);
	  }
	    return total;
		
	}
}
public class VehicleRentalSystem {
	public static void main(String args[]) {
		vehicle v1=new car(1111,200);
		vehicle v2=new motorcycle(1234,120);
		System.out.println(v1.calrent(5));
		System.out.println(v2.calrent(10));
	}
}



