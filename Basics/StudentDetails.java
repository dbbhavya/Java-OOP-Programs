package Basics;
import java.util.Scanner;
public class StudentDetails {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter name:");
		String name=in.nextLine();
		System.out.println("enter roll no.");
		int r=in.nextInt();
		System.out.println("Enter age:");
		int a=in.nextInt();
		System.out.println("Name "+name);
		System.out.println("Roll "+r);
		System.out.println("Age "+a);

	}

}
