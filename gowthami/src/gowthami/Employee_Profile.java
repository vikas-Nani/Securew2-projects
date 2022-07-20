package gowthami;

public abstract class Employee_Profile {
	abstract void SetSalary(int salary);

	abstract int getSalary();

	abstract void SetGrade(String grade);

	abstract String getGrade();

	abstract void label();

}

class Engineer extends Employee_Profile {

	private int salary;
	private String grade;
    
	public Engineer(int salary, String grade) {
		super();
		this.salary = salary;
		this.grade = grade;
	}

	@Override
	void SetSalary(int salary) {
		this.salary = salary;

	}

	@Override
	int getSalary() {

		return salary;
	}

	@Override
	void SetGrade(String grade) {
		this.grade = grade;

	}

	@Override
	String getGrade() {
		return grade;
	}

	@Override
	void label() {
		System.out.println("Employee's data:");
		System.out.println("GRADE : " + grade);
		System.out.println("SALARY : " + salary);

	}

}

class Manager extends Employee_Profile {

	private int salary;
	private String grade;
    
	public Manager(int salary, String grade) {
		super();
		this.salary = salary;
		this.grade = grade;
	}

	@Override
	void SetSalary(int salary) {
		this.salary = salary;

	}

	@Override
	int getSalary() {

		return salary;
	}

	@Override
	void SetGrade(String grade) {
		this.grade = grade;

	}

	@Override
	String getGrade() {
		return grade;
	}

	@Override
	void label() {
		System.out.println("Employee's data:");
		System.out.println("GRADE : " + grade);
		System.out.println("SALARY : " + salary);

	}

}
