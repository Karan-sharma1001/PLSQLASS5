package Exception;


import java.util.*;
public class Doctor{
	Scanner s=new Scanner(System.in);
	public void getData() {
		System.out.println("Enter name of Doctor");
		this.name=s.next();
		System.out.println("Enter Degree");
		this.degree=s.next();
	}
	public Scanner getS() {
		return s;
	}
	public void setS(Scanner s) {
		this.s = s;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) throws DoctorException {
		if(degree.length()<0||degree.isEmpty()||degree.equals(""))
		throw new DoctorException();
		else
			this.degree = degree;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Doctor "+"degree=" + degree + ", name=" + name ;
	}
	public void putData(){
		System.out.println("The name of Doctor is "+this.name+"  and Degre is "+this.degree);
		}

	
	private String degree;
	private String name;
	
	

}
