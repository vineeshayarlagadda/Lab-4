package day6.Lab4.Ex2.P2;
import day6.Lab4.Ex2.P1.Employee;

public class Service extends Employee implements EmployeeService{

	@Override
	public void findInsuranceSchema(double salary, String designation) {
		int flag=0;
		String designations[]={"Manager","CEO","Senior Analyst","Managing director"};
		for(int i=0;i<designations.length;i++) {
			if (designation.equals(designations[i])) flag=1;
		}
			if(salary<50000)System.out.println("Eligible for : Life insurance, Health Insurance");
			if(salary>=50000 && salary<100000 && flag==0)System.out.println("Eligible for : Life insurance, Health Insurance, Travel insurance");
			if(salary>=50000 && salary<100000 && flag==1)System.out.println("Eligible for : Life insurance, Health Insurance, Travel insurance, Property Insurance");
			if(salary>=100000)System.out.println("Eligible for all types of insurance");
		}
		

	@Override
	public void getEmployeeDetails() {
		displayEmpDetails();
	}

	@Override
	public void displayEmpDetails() {
		System.out.println("Employee Name : "+getName());
		System.out.println("Employee Id : "+getId());
		System.out.println("Employee Designation : "+getDesignation());
		System.out.println("Employee Salary : "+getSalary());
		
	}
		
	}
	
