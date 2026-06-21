package Inheritance;
class items{
	int id;
	String name;
	int price;
	items(int id,String name,int price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	void display() {
		System.out.println("Id "+id+" Name "+name+" Price "+price);
	}
}
class discountitem extends items{
	int dprice;
	discountitem(int id,String name,int price,int dprice){
		super(id,name,price);
		this.dprice=dprice;
	}
	void display() {
		super.display();
		System.out.println("Item price "+super.price);
		System.out.println("Discount price "+dprice);
		
	}
	
}
public class DiscountItemDemo {

	public static void main(String[] args) {
		discountitem s1=new discountitem(12,"Bhavya",220,100);
		s1.display();
	}

}



