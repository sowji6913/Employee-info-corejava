package com.capg;

public class EmployeeManagement {

	public static void main(String[] args) {
		Employee emp1= new Employee("rakesh",101,50000);
		Employee emp2= new Employee("akhil",101,50000);
		Employee emp3= new Employee("mahesh",101,50000);
		 Employee []arr=new Employee[3];
		arr[0]=emp1;
		arr[1]=emp2;
		arr[2]=emp3;
		for(Employee e:arr) {
			System.out.println(e);
			//System.out.println(e.getName());
			//System.out.println(e.getSal());
		}

	}

}
