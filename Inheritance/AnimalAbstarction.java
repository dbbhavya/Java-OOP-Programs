package Inheritance;
abstract class animal{
	String diet;
	animal(String diet)
	{
		this.diet=diet;
	}
	abstract void makesound();
}
class lion extends animal{
	lion(String diet){
		super(diet);
	}
	void makesound() {
		System.out.println("Lions sound");
	}
}
class elephant extends animal{
	elephant(String diet){
		super(diet);
	}
	void makesound() {
		System.out.println("Elephants sound");
	}
}
public class AnimalAbstarction {
	public static void main(String args[]) {
		animal a1=new lion("Carnivores");
		animal a2=new elephant("Herbivores");
		a1.makesound();
		a2.makesound();
	}
}



