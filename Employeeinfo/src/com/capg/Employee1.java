package com.capg;
import java.util.Scanner;

public class Employee1 {

	public static void main(String[] args) {
		int id;
		String name;
		Float salary;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		id=sc.nextInt();
		System.out.println("enter the name");
		name=sc.nextInt()+sc.nextLine();
	
		System.out.println("enter the salary");
		salary=sc.nextFloat();
		Employee1 ep1= new Employee1();
		Employee1 ep2= new Employee1();
		Employee1 ep3= new Employee1();
		Employee1[]arr =new Employee1[3];
		arr[0]=ep1;
		arr[1]=ep2;
		arr[2]=ep3;
		for(Employee1 e:arr) {
			System.out.println(e);
		
	}

}
}
