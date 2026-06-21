package Files;
/*import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
public class basic_files {
	public static void main(String args[]) {
		try{FileInputStream in=new FileInputStream("C:\\Users\\BHAVYA\\OneDrive\\Desktop\\Bhavya JAVA\\Myself.txt")
			int i;
			while((i=in.read())!=-1) {
				System.out.print((char)i);
			}
		}
		catch(IOException e) {
			System.out.println("Error reading file");
		}
	}
}*/
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class basic_files{
	public static void main(String args[]) {
		try{FileInputStream fis=new FileInputStream("C:\\Users\\BHAVYA\\OneDrive\\Desktop\\Bhavya JAVA\\Myself.txt");
			FileOutputStream fos=new FileOutputStream("bhavs.txt");
			int i;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
				fos.write((char)i);
			}
			fos.close();
		}
		catch(IOException e) {
			System.out.println("Not found");
		}
	}
}