package demo.multithreading;
public class EmployeeRunnable implements Runnable {
	int eno;
	String ename;
	int basicSalary;
	

	public void CalculateSalaryHRA() {
		double sal = .1 * basicSalary;
		System.out.println(Thread.currentThread().getName() + sal);
	}

	public void CalculateSalaryDA() {
		double sal = .25 * basicSalary;
		System.out.println(Thread.currentThread().getName() + sal);
	}

	public void CalculateSalaryCA() {
		double sal = .1 * basicSalary;
		System.out.println(Thread.currentThread().getName() + sal);

	}

	@Override
	public void run() {

		CalculateSalaryHRA();
		CalculateSalaryDA();
		CalculateSalaryCA();
	}

	public EmployeeRunnable(int eno, String ename, int basicSalary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.basicSalary = basicSalary;
	}

	public static void main(String[] args) {

		EmployeeRunnable emp1 = new EmployeeRunnable(1, "A", 2000);
		EmployeeRunnable emp2 = new EmployeeRunnable(2, "B", 3000);
		EmployeeRunnable emp3 = new EmployeeRunnable(3, "C", 4000);

		Thread t1 = new Thread(emp1);
		t1.setName("Employee1");
		Thread t2 = new Thread(emp2);
		t2.setName("Employee2");
		Thread t3 = new Thread(emp3);
		t3.setName("Employee3");

		t1.start();
		t2.start();
		t3.start();

	}

	}



