package MiniProjects;
import java.util.Scanner;

public class DiceGame {
  public static void main(String args[]) {
	  Scanner in=new Scanner(System.in);
		int choice=0;
		while(true) {
			System.out.println("Enter your choice:");
			System.out.println("1.To continue");
			System.out.println("2.To quit");
			choice=in.nextInt();
			if (choice==1) {
				System.out.println("Dice1:");
				int d1=in.nextInt();
				System.out.println("Dice2:");
				int d2=in.nextInt();
				int s=0;
				s=d1+d2;
				if(s==7||s==11) {
					System.out.println("You rolled "+d1+" + "+d2+" "+"="+s);
					System.out.println("You Win");
				}
				else if(s==2||s==3||s==12) {
					System.out.println("You rolled "+d1+" + "+d2+" "+"="+s);
					System.out.println("You lose");
				}
				else {
					System.out.println("You rolled "+d1+" + "+d2+" "+"="+s);
					System.out.println("point is "+s);
					while(true) {
						System.out.println("d11:");
						int d11=in.nextInt();
						System.out.println("d22:");
						int d22=in.nextInt();
						int s1=0;
						s1=d11+d22;
						if(s1==s) {
							System.out.println("You rolled "+d11+" + "+d22+" "+"="+s1);
							System.out.println("You win");
							break;
						}
						else {
							System.out.println("You rolled "+d11+" + "+d22+" "+"="+s1);
							System.out.println("You loose");
							
						  }
						
					   }
				   }
				    
				
			}
			else {
				System.out.println("Exit game");
				break;
				}
			
		}
  }
	
}



