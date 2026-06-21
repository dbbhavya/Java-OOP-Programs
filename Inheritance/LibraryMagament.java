package Inheritance;
class library{
	String title;
	String code;
	library(String title,String code){
		this.title=title;
		this.code=code;
	}
	void checkout() {
		System.out.println("Item Borrowed");
	}
}
class book extends library{
	String author;
	book(String title,String code,String author){
		super(title,code);
		this.author=author;
	}
	
}
class dvd extends library{
	int dur;
	dvd(String title,String code,int dur){
		super(title,code);
		this.dur=dur;
	}
	void checkout() {
		super.checkout();
		System.out.println("Please return in 3 days");
	}	
}
public class LibraryMagament {
	public static void main(String args[]) {
		library l=new library("Saaho","s103");
		book b=new book("Bahubali","p101","SSR");
		dvd d=new dvd("Tarak mama","w102",30);
		l.checkout();
		b.checkout();
		d.checkout();
	}
}



