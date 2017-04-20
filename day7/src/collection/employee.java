package collection;

public class employee {
	String name;
	int empid;
	int salary;
	 
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public int getSalary() {
		return salary;
	}


	@Override
	public String toString() {
		return "name=" + name + ", empid=" + empid + ", salary="
				+ salary ;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}

	public employee(){
		System.out.println("DEFAULT CONSTRUCTOR");
	}
	public employee(String s , int e, int sal) {
		System.out.println("parameter");
		name=s;
		empid=e;
		salary=sal;
		
	}
	public void showInfo(){
		System.out.println("Name of employee is "+name+"  "+"  Employee id is  "+empid+"  Slaray is   "+salary);
	}
	public static void main(String[] args) {
		employee e1=new employee();
		e1.showInfo();
		e1.setSalary(985230);
		employee e2=new employee("KARAN",501632,985000);
		e2.showInfo();
		System.out.println(e1.getEmpid());
		System.out.println(e1.name);
		System.out.println(e1.salary);
	}
}
