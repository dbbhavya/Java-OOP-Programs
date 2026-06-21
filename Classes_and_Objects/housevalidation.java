package Classes_and_Objects;
import java.util.Scanner;
class house{
	int weight;
	int height;
	int width;
	house(int weight,int height,int width){
		this.height=height;
		this.weight=weight;
		this.width=width;
	}
	public void check() {
		int l=0;
		int gcd=1;
		if(width<height) {
			l=width;
		}
		else {
			l=height;
		}
		for(int i=1;i<=l;i++) {
			if(width%i==0&&height%i==0) {
				gcd=i;
			}
		}
		int lcm=(width*height)/gcd;
		
	}
	
}
