package com.oops.examples;

public class Demo1 {

	
	public static void main(String[] args) {
		
		Address address=new Address("596366", "hvt");
		Customer customer=new Customer("santhosh", "30", "male",address);

		
		Customer customer2=new Customer();
		System.out.print(customer);

	}
}