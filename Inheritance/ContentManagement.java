package Inheritance;
class content{
	private String title;
	protected double rating;
	content(String title,double rating){
		this.title=title;
		this.rating=rating;
	}
	void toset(String title, double rating) {
		this.title = title;
		this.rating = rating;
	}
	void toget() {
		System.out.println("Title: " + title);
		System.out.println("Rating: " + rating);
	}
}
class video extends content{
	protected int duration;
	public String resolution;
	video(String title,double rating,int duration,String resolution){
		super(title,rating);
		this.duration=duration;
		this.resolution=resolution;
	}
	void toset(int duration,String resolution) {
		this.duration=duration;
		this.resolution=resolution;
	}
	void toget() {
		super.toget();
		System.out.println("Duration: " + duration);
		System.out.println("Resolution: " + resolution);
	}
}
class movie extends video{
	public String category;
	private String language;
	movie(String title,double rating,int duration,String resolution,String category,String language){
		super(title,rating,duration,resolution);
		this.category=category;
		this.language=language;
	}
	void display() {
		super.toget();
		System.out.println("Category:"+category);
		System.out.println("Language:"+language);
	}
}
public class ContentManagement {

	public static void main(String[] args) {
		movie m=new movie("Bahubali",9,3,"120px","Action","Telugu");
		m.display();
	}

}

