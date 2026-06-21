
package Classes_and_Objects;


import java.util.Scanner;
class Project{
	String proj_id;
	String name;
	int emp_id;
	int exp;
	private boolean assigned;
	private int proj_type=1;
	public void getdata(String proj_id,String name,int emp_id,int exp,int proj_type) {
		this.proj_id=proj_id;
		this.name=name;
		this.emp_id=emp_id;
		this.exp=exp;
		this.proj_type=proj_type;
	}
	public void display() {
		System.out.println("Proj_id- "+proj_id);
		System.out.println("Name "+name);
		System.out.println("Emp_id "+emp_id);
		System.out.println("Experience- "+exp);
		System.out.println("Proj_type- "+proj_type);
		if (assigned==true) {
			System.out.println("Assigned - True");
		}
		else {
			System.out.println("assigned - Null");
		}
	}
	private void assigning() {
		if (exp<2){
			 assigned=false;		}
		else {
			assigned=true;
		}
	}
	public void check_proj_type() {
		if(proj_type==0) {
		    assigning();
		}
		else {
			assigned=false;
		}
	}
	
}
public class project_management {
	
	
	
		public static void main(String args[]) {
			Scanner in=new Scanner(System.in);
			Project p[]=new Project[3];
			for(int i=0;i<3;i++) {
				System.out.println("Projecct Id");
				String proj_id=in.nextLine();
				System.out.println("Name");
				String name=in.nextLine();
				System.out.println("Emp_id");
				int emp_id=in.nextInt();
				in.nextLine();
				System.out.println("Expereince");
				int exp=in.nextInt();
				in.nextLine();
				System.out.println("Project type");
				int proj_type=in.nextInt();
				in.nextLine();
				p[i]=new Project();
				p[i].getdata(proj_id, name, emp_id, exp, proj_type);
				p[i].check_proj_type();
			}
			for(int i=0;i<3;i++) {
				p[i].display();
			}
			
		}
	}


