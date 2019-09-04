package demo.multithreading;

public class Employee extends Thread {
	int eno;
	String ename;
	int  basicSalary;
	public  void CalculateSalaryHRA()
	{
		double sal= .1* basicSalary;
		System.out.println(getName()+sal);
	}
	public  void CalculateSalaryDA()
	{
		double sal= .25* basicSalary;
		System.out.println(getName()+sal);
	}
	public  void CalculateSalaryCA()
	{
		double sal= .1* basicSalary;
		System.out.println(getName()+sal);
		
	}
	
	@Override
	public void run() {
		super.run();
		CalculateSalaryHRA();
		CalculateSalaryDA();
		CalculateSalaryCA();	
	}
	public Employee(int eno, String ename, int basicSalary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.basicSalary = basicSalary;
	}
	public static void main(String[] args) {
	 
		Employee emp1= new Employee(1,"A",2000);emp1.setName("Employee1");
		Employee emp2= new Employee(2,"B",3000);emp2.setName("Employee2");
		Employee emp3= new Employee(3,"C",4000);emp3.setName("Employee3");
		
		emp1.start();
		emp2.start();
		emp3.start();
		

	}

}
