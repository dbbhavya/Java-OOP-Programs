package Exception_Handling;

/*public class exception { 
	public static void main(String args[]) {
		int d,a;
		int arr[]= {1,2,3,4};
		System.out.println("Before exception statement");
		d=0;
		arr[5]=100;
		a=42/d;
		
		System.out.println("After");
	}
}*/
/*public class exception{
	public static void main(String args[]) {
		int d,a;
		int arr[]= {1,2,3,4};
		try {
			d=0;
			arr[8]=100;
			a=42/d;
			
			System.out.println("At the end of try block");
			
		}
		catch(ArithmeticException e) {
			System.out.println("Divide by zero "+e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of bound "+e);
		}
		catch(Exception e) {
			System.out.println("Parent exception is "+e);
		}
		System.out.println("Out of try-catch");
		
		
	}
}*/
/*public class exception{
	static void demoproc() {
		try {
			throw new NullPointerException();
		}
		catch(NullPointerException e) {
			System.out.println("Caught inside demoproc "+e);
			throw e;
		}
	}
	public static void main(String args[]) {
		try {
			demoproc();
		}
		catch(NullPointerException e){
			System.out.println("In main class "+e);
			throw e;
		}
	}
}*/


/*public class exception{
	static void except() 
	//throws NullPointerException,ArithmeticException 
	{
		
		System.out.println("Inside throw ");
		int a=10;
		int b=0;
		
		{	
			if(b==0) {
				System.out.println("Inside if");
//				throw new ArithmeticException("use msg");
				
			}
			try
			{
				int x=a/b;
				
			}
			catch(ArithmeticException e) {
				System.out.println("papa "+e);
				throw e;
			}
			
		}
	}
		public static void main(String args[]) {
			try {
				except();
			}
			catch(NullPointerException e) {
				System.out.println("caught nullpointerexception"+e);
			}
			catch(ArithmeticException e) {
				System.out.println("caught ArithmeticException "+e);
			}
	}
}*/
/*class student{
	int arr[]= {1,3,7,9};
	public void calculate() {
		//int access=arr[5];
		int avg=100/0;
	}
}
public class exception{
	public static void main(String args[]) {
		student s=new student();
		try {
			s.calculate();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bound");
		}
		catch(ArithmeticException e) {
			System.out.println("Divided by zero");
		}
	}
}*/
/*class bank{
	double balance;
	void withdraw(double amount) {
		if(amount>balance) {
			throw new ArithmeticException("Insufficient balance!");
		}
		else {
			balance=balance-amount;
			System.out.println("Remainng amount:"+balance);
		}
	}
	
}
public class exception{
	public static void main(String args[]) {
		bank b=new bank();
		b.balance=1000;
		try {
			b.withdraw(200);
		}
		catch(ArithmeticException e) {
			System.out.println("Error:"+e);
		}
	}
	
}*/
class student{
	void calculate() {
		int arr[]= {1,2,3};
		int avg=100/0;
		System.out.println("Required mark is:"+arr[6]);
		
		System.out.println("Average is:"+avg);	
	}
}
public class exception{
	public static void main(String args[]) {
		student s=new student();
		try {
			s.calculate();
		}
		catch(ArithmeticException e) {
			System.out.println("AE");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOB"+e);
		}
		try {
			Class.forName("demo");
		}
		catch(ClassNotFoundException e2) {
			System.out.println("Class not found");
		}
		catch(Exception e1) {
			System.out.println("Other than the class out of bound");
		}
		finally {
			System.out.println("ALWAYS there for you");
		}
	}
}