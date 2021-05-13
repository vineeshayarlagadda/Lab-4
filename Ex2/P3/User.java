package day6.Lab4.Ex2.P3;
import day6.Lab4.Ex2.P2.EmployeeService;
import day6.Lab4.Ex2.P2.Service;
import day6.Lab4.Ex2.P1.Employee;
import java.util.*;

public class User {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Service service = new Service();
		System.out.println("Enter the employee name : ");
		service.setName(sc.next());
		System.out.println("Enter the employee id : ");
		service.setId(sc.nextInt());
		System.out.println("Enter the employee salary : ");
		service.setSalary(sc.nextDouble());
		System.out.println("Enter the employee designation : ");
		service.setDesignation(sc.next());
		System.out.println("---------Insurance scheme details---------");
		System.out.println();
		service.findInsuranceSchema(service.getSalary(), service.getDesignation());
		System.out.println();
		System.out.println("-------------Employee Details-------------");
		System.out.println();
		service.getEmployeeDetails();
		
	}

}
