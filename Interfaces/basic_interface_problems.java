package Interfaces;
/*interface animal{
	public void animalsound();
	public void sleep();
}
class pig implements animal{
	public void animalsound() {
		System.out.println("Wee wee");
	}
	public void sleep() {
		System.out.println("Zee zee");
	}
}
public class interface_ex {

	public static void main(String[] args) {
		pig p=new pig();
		p.animalsound();
		p.sleep();
	}

}*/
/*interface student_info{
	void student_data();
	default void default_fun() {
		System.out.println("In demo interface function");
	}
}
class subject{
	int sem;
	String name;
	void printsub() {
		System.out.println("Sem: "+sem+" name: "+name);
	}
}
class UG extends subject implements student_info{
	int roll;
	public void student_data() {
		System.out.println("In UG class \n"+"Roll number: "+roll);
	}
}
public class interface_ex{
	public static void main(String args[]) {
		UG obj=new UG();
		obj.sem=2;
		obj.name="Bhavya";
		obj.roll=25211;
		obj.default_fun();
		obj.printsub();
		obj.student_data();
	}
}*/
/*interface memory{
	public int maxsize=10;
	public void mem_connect();
	public void mem_conf();
}
interface display{
	public int maxwidth=720;
	public void disp_connect();
	public void disp_conf();
}
class lap implements memory,display{
	int mem_size;
	int l_width;
	int l_height;
	
	lap()
	{
		mem_size =8;
		l_width = 14;
		l_height = 8;		
		
	}
	
	public void mem_connect()
	{
		System.out.print("\n In Lap - mem_connect ");
	}
	public void mem_conf()
	{
		System.out.print("\n In Lap - mem_conf ");
	}
	
	public void disp_connect()
	{
		System.out.print("\n In Lap - Display_connect ");
	}
	public void disp_conf()
	{
		System.out.print("\n In Lap - Display_connect ");
	}
	
	void check_lap_mem()	// class has its own methods 
	{
		if (mem_size<maxsize)
			System.out.print(" \n Correct Parameters ");
	}

}
public class interface_ex{
	public static void main(String args[]) {
		lap l=new lap();
		l.disp_connect();
		l.disp_connect();
		l.mem_conf();
		l.mem_connect();
		l.check_lap_mem();
	}
}*/
/*interface x{
	public void print_x();
}
interface y extends x{
	public void print_y();
}
class z implements x,y{
	public void print_x() {
		System.out.println("X");
		
	}
	public void print_y() {
		System.out.println("Y");
	}
}
public class interface_ex{
	public static void main(String args[]) {
		z obj=new z();
		obj.print_x();
		obj.print_y();
		x obj1=new z();
		y obj2=new z();
		obj1.print_x();
		obj2.print_y();
		
	}
}*/
